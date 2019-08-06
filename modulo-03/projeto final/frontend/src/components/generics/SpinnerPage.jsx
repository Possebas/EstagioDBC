import React from "react";
import Spinner from 'react-bootstrap/Spinner'

const SpinnerPage = () => {
  return (
    <Spinner animation="border" variant="secondary" role="status">
      <span className="sr-only">Loading...</span>
    </Spinner>
  );
}
export default SpinnerPage;