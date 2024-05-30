import React, { useState } from "react";

const DateInputComponent = () => {
  const [selectedDate, setSelectedDate] = useState("");

  const handleDateChange = (e) => {
    setSelectedDate(e.target.value);
  };

  return (
    <div className="p-4">
      <label htmlFor="date" className="block text-sm font-medium text-gray-700">
        Select a Date:
      </label>
      <input
        type="date"
        id="date"
        name="date"
        value={selectedDate}
        onChange={handleDateChange}
        className="mt-1 p-2 border border-gray-300 rounded-md focus:outline-none focus:ring-blue-500 focus:border-blue-500"
      />
    </div>
  );
};

export default DateInputComponent;
