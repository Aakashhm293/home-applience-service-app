import React from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import TechnicianDashboard from "../Dashboards/TechnicianDashboard/TechnicianDashboard";
import PageNotFound from "../PageNotFound/PageNotFound";
import PricingPage from "../PricingPage/PricingPage";
import AboutUs from "../AboutPage/AboutUs";
import CustLogin from "../Login/CustomerLogin/CustLogin";
import CustRegister from "../Login/CustomerLogin/CustRegister";
import ServicePage from "../ServicesPage/ServicesPage";
import UserSelection from "../Login/UserSelection/UserSelection";
import TechnicianLogin from "../Login/TechnicianLogin/TechnicianLogin";
import { AnimatePresence } from "framer-motion";
import CustomerDashboard from "../Dashboards/CustomerDashboard/CustomerDashboard";
import HomePage from "../HomePage/HomePage";

function MainRouter() {
  return (
    <>
      <AnimatePresence mode="wait">
        <BrowserRouter>
          <Routes>
            <Route path="/" element={<HomePage />} />
            <Route path="custdashboard" element={<CustomerDashboard />} />
            <Route path="services" element={<ServicePage />} />
            <Route path="plans" element={<PricingPage />} />
            <Route path="about" element={<AboutUs />} />
            <Route path="login" element={<CustLogin />} />
            <Route path="custregister" element={<CustRegister />} />
            <Route path="userselection" element={<UserSelection />} />
            <Route path="custlogin" element={<CustLogin />} />
            <Route path="techlogin" element={<TechnicianLogin />} />
            <Route path="*" element={<PageNotFound />} />
            <Route path="techdashboard" element={<TechnicianDashboard />} />
          </Routes>
        </BrowserRouter>
      </AnimatePresence>
    </>
  );
}

export default MainRouter;
