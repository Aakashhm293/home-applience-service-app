
import React from 'react'
import { BrowserRouter,Routes,Route } from 'react-router-dom'
import {HomePage} from './HomePage'
import {CustumerLogin} from '../CustumerLogin'
import {CustRegister} from '../CustRegister'

const MainRouter = () => {
  return (
    <div>
      <BrowserRouter>
      <Routes>
      <Route exact path="/" element={<HomePage/>}></Route>
      <Route exact path="/Login" element={<CustumerLogin/>}></Route>
      <Route exact path="/Register" element={<CustRegister/>}></Route>
      </Routes>
      </BrowserRouter>
    </div>
  )
}

export default MainRouter