import { Link } from "react-router-dom";
import { motion } from "framer-motion";

export default function CustLogin() {

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
              src="data:image/png;base64,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"
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
                    className="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset focus:ring-indigo-600 sm:text-sm sm:leading-6 p-3"
                  />
                </div>
              </div>

              <div>
                <div className="flex items-center justify-between">
                  <label
                    htmlFor="password"
                    className="block text-sm font-medium leading-6 text-gray-900"
                  >
                    Password
                  </label>
                  <div className="text-sm">
                    <Link className="font-semibold text-indigo-600 hover:text-indigo-500">
                      Forgot password?
                    </Link>
                  </div>
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
                <Link
                  to="/custdashboard"
                  className="flex w-full justify-center rounded-md bg-indigo-600 px-3 py-1.5 text-sm font-semibold leading-6 text-white shadow-sm hover:bg-indigo-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600"
                >
                  Log in
                </Link>
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
