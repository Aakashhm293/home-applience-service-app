import { Link, useNavigate } from "react-router-dom";
import { motion } from "framer-motion";
import customer from "../../../images/customer.png";
import { useState } from "react";
import axios from "axios";

export default function CustLogin() {
  const [cred, setCred] = useState();

  const navigate = useNavigate();

  const loginUser = async (cred) => {
    if (cred.email != null) {
      let res = await axios.post("http://localhost:8080/customer/login", cred);
      if (res.data.data) {
        alert(res.data.message);
        navigate("/custdashboard");
      }
    }
  };

  return (
    <>
      <motion.div
        initial={{ opacity: 0 }}
        animate={{ opacity: 1 }}
        exit={{ opacity: 0 }}
        transition={{ duration: 1.5 }}
      >
        <div className="flex min-h-full flex-1 flex-col justify-center px-6 py-12 mt-20 lg:px-8">
          <div className="sm:mx-auto sm:w-full sm:max-w-sm">
            <img
              className="mx-auto h-10 w-auto"
              src={customer}
              alt="Your Company"
            />
            <h2 className="mt-10 text-center text-2xl font-bold leading-9 tracking-tight text-gray-900">
              Customer Login
            </h2>
          </div>
          <div className="circlePosition w-[460px] h-[400px] bg-gradient-to-r from-cyan-500 to-blue-500 rounded-[50%] absolute z-1 top-[0] translate-x-[20] opacity-30 blur-[34px] left-[10%]"></div>
          <div className="circlePosition w-[460px] h-[400px] bg-gradient-to-r from-violet-500 to-purple-500 rounded-[50%] absolute z-1 top-[50%] translate-x-[20px] opacity-30 blur-[34px] right-[10%]"></div>

          <div className="mt-10 sm:mx-auto sm:w-full sm:max-w-sm">
            <form className="space-y-6" action="#" method="POST">
              <div>
                <label
                  htmlFor="email"
                  className="block text-sm font-medium leading-6 text-gray-900"
                >
                  Email address
                </label>
                <div className="mt-2">
                  <input
                    id="email"
                    name="email"
                    type="email"
                    autoComplete="email"
                    required
                    onChange={(event) =>
                      setCred({ ...cred, email: event.target.value })
                    }
                    className="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6 p-3"
                  />
                </div>
              </div>

              <div>
                <div className="flex items-center justify-between">
                  <label
                    id="password"
                    name="password"
                    type="password"
                    onChange={(event) =>
                      setCred({
                        ...cred,
                        password: event.target.value,
                      })
                    }
                    className="block text-sm font-medium leading-6 text-gray-900"
                  >
                    Password
                  </label>
                  {/* <div className="text-sm">
                    <Link className="font-semibold text-indigo-600 hover:text-indigo-500">
                      Forgot password?
                    </Link>
                  </div> */}
                </div>
                <div className="mt-2">
                  <input
                    id="password"
                    name="password"
                    type="password"
                    autoComplete="current-password"
                    required
                    className="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6 p-3"
                  />
                </div>
              </div>
              <div>
                <button
                  type="button"
                  onClick={() => loginUser(cred)}
                  className="flex w-full justify-center rounded-md bg-indigo-600 px-3 py-1.5 text-sm font-semibold leading-6 text-white shadow-sm hover:bg-indigo-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600"
                >
                  Log in
                </button>
              </div>
            </form>

            <p className="mt-10 text-center text-sm text-gray-500">
              Not a member?{" "}
              <Link to="/custregister" className="text-indigo-600">
                Please Register Here
              </Link>
            </p>
          </div>
        </div>
      </motion.div>
    </>
  );
}