const products = [
  {
    id: 1,
    name: "Fan",
    href: "#",
    price: "₹500",
    imageSrc:
      "https://images.unsplash.com/photo-1564510182791-29645da7fac4?w=900&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8ZmFufGVufDB8fDB8fHww",
    imageAlt:
      "White fabric pouch with white zipper, black zipper pull, and black elastic loop.",
  },
  {
    id: 2,
    name: "Air Conditioner",
    href: "#",
    price: "₹1000",
    imageSrc:
      "https://images.unsplash.com/photo-1436473849883-bb3464c23e93?w=900&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8YWlyJTIwY29uZGl0aW9uZXJ8ZW58MHx8MHx8fDA%3D",
    imageAlt:
      "Front of tote bag with washed black canvas body, black straps, and tan leather handles and accents.",
  },
  {
    id: 3,
    name: "Washing Machine",
    href: "#",
    price: "₹500",
    imageSrc:
      "https://images.unsplash.com/photo-1626806819282-2c1dc01a5e0c?w=900&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8V2FzaGluZyUyME1hY2hpbmV8ZW58MHx8MHx8fDA%3D",
    imageAlt:
      "Front of satchel with blue canvas body, black straps and handle, drawstring top, and front zipper pouch.",
  },
  {
    id: 4,
    name: "Wireless Routers",
    href: "#",
    price: "₹200",
    imageSrc:
      "https://images.unsplash.com/photo-1606421753414-8d165c9d48e5?w=900&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8V2ZpJTIwUm91dGVyfGVufDB8fDB8fHww",
    imageAlt:
      "Front of satchel with blue canvas body, black straps and handle, drawstring top, and front zipper pouch.",
  },
  {
    id: 5,
    name: "Dryer",
    href: "#",
    price: "₹350",
    imageSrc:
      "https://plus.unsplash.com/premium_photo-1681487158724-443dc1f2c2c7?w=900&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzN8fERyeWVyfGVufDB8fDB8fHww",
    imageAlt:
      "Front of satchel with blue canvas body, black straps and handle, drawstring top, and front zipper pouch.",
  },
  {
    id: 6,
    name: "Refrigerator",
    href: "#",
    price: "₹450",
    imageSrc:
      "https://images.unsplash.com/photo-1643705314142-6f072c3d48fa?w=900&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDR8fHJlZnJpZ2VyYXRvcnxlbnwwfHwwfHx8MA%3D%3D",
    imageAlt:
      "Front of satchel with blue canvas body, black straps and handle, drawstring top, and front zipper pouch.",
  },
];

export default function Products() {
  return (
    <div className="bg-white">
      <div className="max-w-7xl mx-auto py-16 px-4 overflow-hidden sm:py-24 sm:px-6 lg:px-8">
        <div className="grid grid-cols-1 gap-y-10 gap-x-6 sm:grid-cols-2 lg:grid-cols-3 lg:gap-x-8">
          {products.map((product) => (
            <a key={product.id} href={product.href} className="group text-sm">
              <div className="w-full aspect-w-1 aspect-h-1 rounded-lg overflow-hidden bg-gray-100 group-hover:opacity-75">
                <img
                  src={product.imageSrc}
                  alt={product.imageAlt}
                  className="w-full h-full object-center object-cover"
                />
              </div>
              <h3 className="mt-4 font-medium text-gray-900">{product.name}</h3>
              <p className="text-gray-500 italic">{product.availability}</p>
              <p className="mt-2 font-medium text-gray-900">{product.price}</p>
            </a>
          ))}
        </div>
      </div>
    </div>
  );
}
