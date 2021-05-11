import React, { useState, useEffect } from 'react';

function App() {
  const [message, setMessage] = useState('');

  useEffect(() => {
    fetch('/hello')
      .then((response) => response.text())
      .then((message) => {
        setMessage(message);
      });
  }, []);

  return <h1>{message}</h1>;
}

export default App;
