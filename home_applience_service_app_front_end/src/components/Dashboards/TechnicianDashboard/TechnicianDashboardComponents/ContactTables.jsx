import axios from "axios";
import { useEffect } from "react";
import { useState } from "react";

export default function ContactTables() {
  // useEffect(() => {
  //   getReq();
  // }, []);
  const [fetchServiceRequests, setFetchServiceRequests] = useState([]);
  // const getReq = () => {
  //   axios
  //     .get("http://localhost:8080/service/all")
  //     .then((res) => setFetchServiceRequests(res.data.data));
  //   console.log(fetchServiceRequests);
  // };
  useEffect(() => {
    getReq();
  }, []);

  // const [fetchServiceRequests, setFetchServiceRequests] = useState([]);

  const getReq = () => {
    axios
      .get("http://localhost:8080/service/all")
      .then((res) => setFetchServiceRequests(res.data.data));
  };
  return (
    <div className="flex flex-col">
      <div className="-my-2 overflow-x-auto sm:-mx-6 lg:-mx-8">
        <div className="py-2 align-middle inline-block min-w-full sm:px-6 lg:px-8">
          <div className="shadow overflow-hidden border-b border-gray-200 sm:rounded-lg">
            <table className="min-w-full divide-y divide-gray-200">
              <thead className="bg-gray-50">
                <tr>
                  <th
                    scope="col"
                    className="px-6 py-3 text-left text-xs font-bold text-black tracking-wider"
                  >
                    Created On
                  </th>
                  <th
                    scope="col"
                    className="px-6 py-3 text-left text-xs font-bold text-black tracking-wider"
                  >
                    Updated On
                  </th>
                  <th
                    scope="col"
                    className="px-6 py-3 text-left text-xs font-bold text-black tracking-wider"
                  >
                    Appointment Date
                  </th>
                  <th
                    scope="col"
                    className="px-6 py-3 text-left text-xs font-bold text-black tracking-wider"
                  >
                    Service Status
                  </th>
                  <th
                    scope="col"
                    className="px-6 py-3 text-left text-xs font-bold text-black tracking-wider"
                  >
                    Comments
                  </th>
                </tr>
              </thead>
              <tbody className="bg-white divide-y divide-gray-200">
                {fetchServiceRequests.map((req) => {
                  return (
                    <tr
                      key={req.serviceId}
                      className="hover:bg-gray-100 transition duration-300"
                    >
                      <td className="py-2 px-4">{req.createdOn}</td>
                      <td className="py-2 px-4">{req.updatedOn}</td>
                      <td className="py-2 px-4">{req.appointmentDate}</td>
                      <td className="py-2 px-4">{req.serviceStatus}</td>
                      <td className="py-2 px-4">{req.comment}</td>
                    </tr>
                  );
                })}
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  );
}
