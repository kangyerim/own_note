import React, { useState, useEffect } from 'react';
import TestApi from './api/testApi';

function App() {
  const [message, setMessage] = useState('');

  useEffect(() => {
    TestApi.hello().then(res => {
      setMessage(res.data)
    })
    .catch(err => console.log(err))
  }, []);

  return <h1>프록시 확인! {message}</h1>;
}

export default App;
