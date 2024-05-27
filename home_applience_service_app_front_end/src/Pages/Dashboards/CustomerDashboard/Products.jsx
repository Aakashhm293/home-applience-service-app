import { Link } from "react-router-dom";
import { motion } from "framer-motion";

const products = [
  {
    id: 1,
    name: "Fan",
    to: "#",
    imageSrc:
      "https://images.unsplash.com/photo-1564510182791-29645da7fac4?w=400&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8RmFufGVufDB8fDB8fHww",
    imageAlt: "Fan",
  },
  {
    id: 2,
    name: "Air Conditioner",
    to: "#",
    imageSrc:
      "https://images.unsplash.com/photo-1436473849883-bb3464c23e93?q=80&w=1470&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
    imageAlt: "AC",
  },
  {
    id: 3,
    name: "Washing Machine",
    to: "#",
    imageSrc:
      "https://images.unsplash.com/photo-1626806787461-102c1bfaaea1?w=400&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8V2FzaGluZyUyMG1hY2hpbmV8ZW58MHx8MHx8fDA%3D",
    imageAlt: "Washing Machine",
  },
  {
    id: 4,
    name: "Wireless Routers",
    to: "#",
    imageSrc:
      "https://plus.unsplash.com/premium_photo-1675024346167-e5fd43181f16?w=400&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTd8fHdpcmVsZXNzJTIwcm91dGVyfGVufDB8fDB8fHww",
    imageAlt: "Wireless router",
  },
  {
    id: 5,
    name: "Coffee Dispenser",
    to: "#",
    imageSrc:
      "https://plus.unsplash.com/premium_photo-1661281243564-5acf9a1797ed?w=400&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8Y29mZmVlJTIwbWFjaGluZXxlbnwwfHwwfHx8MA%3D%3D",
    imageAlt: "Coffee Dispenser",
  },
  {
    id: 6,
    name: "Refrigerator",
    to: "#",
    imageSrc:
      "https://media.istockphoto.com/id/990894662/photo/modern-fridge-in-front-of-white-wall.webp?b=1&s=170667a&w=0&k=20&c=WMEUix4zvDRc0baQ2i-E1IxjpS6lXw_vWgiIGeKurKk=",
    imageAlt: "Refrigerator",
  },
];

export default function Products() {
  return (
    <>
      <motion.div
        initial={{ opacity: 0 }}
        animate={{ opacity: 1 }}
        exit={{ opacity: 0 }}
        transition={{ duration: 1.5 }}
      >
        <div className="bg-white">
          <div className="max-w-7xl mx-auto py-16 px-4 overflow-hidden sm:py-24 sm:px-6 lg:px-8">
            <div className="grid grid-cols-1 gap-y-10 gap-x-6 sm:grid-cols-2 lg:grid-cols-3 lg:gap-x-8">
              {products.map((product) => (
                <div>
                  <Link
                    key={product.id}
                    to={product.href}
                    className="group text-sm"
                  >
                    <div className="w-full aspect-w-1 aspect-h-1 rounded-lg overflow-hidden bg-gray-100 group-hover:opacity-75">
                      <img
                        src={product.imageSrc}
                        alt={product.imageAlt}
                        className="w-full h-full object-center object-cover"
                      />
                    </div>
                    <h3 className="mt-4 font-medium text-gray-900">
                      {product.name}
                    </h3>
                    <p className="text-gray-500 italic">
                      {product.availability}
                    </p>
                    <p className="mt-2 font-medium text-gray-900">
                      {product.price}
                    </p>
                  </Link>
                  <button
                    type="button"
                    class="mt-5 bg-transparent hover:bg-indigo-500 text-indigo-700 font-semibold hover:text-white py-1 px-3 border border-indigo-500 hover:border-transparent rounded-2xl"
                  >
                    Book Appointment
                  </button>
                </div>
              ))}
            </div>
          </div>
        </div>
      </motion.div>
    </>
  );
}
