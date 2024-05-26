import Fan from "../../../images/products/Fan.avif";
import AC from "../../../images/products/AC.avif";
import WashingMachine from "../../../images/products/WashingMachine.avif";
import Router from "../../../images/products/Router.avif";
import Dryer from "../../../images/products/Dryer.avif";
import Refrigerator from "../../../images/products/Refrigerator.avif";
import { Link } from "react-router-dom";

const products = [
  {
    id: 1,
    name: "Fan",
    href: "#",
    price: "₹500",
    imageSrc: { Fan },
    imageAlt: "Fan",
  },
  {
    id: 2,
    name: "Air Conditioner",
    href: "#",
    price: "₹1000",
    imageSrc: { AC },
    imageAlt: "AC",
  },
  {
    id: 3,
    name: "Washing Machine",
    href: "#",
    price: "₹500",
    imageSrc: { WashingMachine },
    imageAlt: "Washing Machine",
  },
  {
    id: 4,
    name: "Wireless Routers",
    href: "#",
    price: "₹200",
    imageSrc: { Router },
    imageAlt: "Wireless router",
  },
  {
    id: 5,
    name: "Dryer",
    href: "#",
    price: "₹350",
    imageSrc: { Dryer },
    imageAlt: "Dryer",
  },
  {
    id: 6,
    name: "Refrigerator",
    href: "#",
    price: "₹450",
    imageSrc: { Refrigerator },
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
                  <p className="text-gray-500 italic">{product.availability}</p>
                  <p className="mt-2 font-medium text-gray-900">
                    {product.price}
                  </p>
                </Link>
              ))}
            </div>
          </div>
        </div>
      </motion.div>
    </>
  );
}
