import React from 'react';
import { 
  Container, 
  Form, 
  Button, 
  Row, 
  Col,Navbar,Nav, TextField
} from 'react-bootstrap';

import { useState } from "react";
import { Switch } from "@headlessui/react";

function classNames(...classes) {
  return classes.filter(Boolean).join(" ");
}

export default function CustRegister() {
  const [agreed, setAgreed] = useState(false);

const CustRegister = () => {
  return (
    <>

    <Container  style={{paddingTop:'20px' ,backgroundColor: '#DCDCDC', height: '100vh', width: '100vw'}} >
      <h1 className="text-center mx-5 my-5 " >Registeration</h1>
      <Row className="justify-content-center mt-5 ms-5">
        <Col xs={15} md={12}></Col>    
        <Form style={{  paddingTop:'40px',paddingBottom:'30px', backgroundColor: 'white', paddingLeft:'20px', paddingRight:'10px',height:'70vh',  width:'80vh', alignItems:'center'}}>
        
        <Form>
      <Row>
        <Col>
          <Form.Control placeholder="First name" />
        </Col>
        <Col>
          <Form.Control placeholder="Last name" />
        </Col>
      </Row>
    </Form>
    <Form>
      <Form.Group className="mb-4 mt-2" controlId="formGroupEmail">
        <Form.Label>Email</Form.Label>
        <Form.Control type="email" placeholder="Enter email" />
      </Form.Group>
      <Form.Group className="mb-4 mt-2 " controlId="formGroupPassword">
        <Form.Label>Password</Form.Label>
        <Form.Control type="password" placeholder="Password" />
      </Form.Group>
      <Form.Group as={Col} controlId="formGridPassword">
          
          <Form.Control type="password" placeholder="Conform Password" />
        </Form.Group>


        <Form.Group className="mb-4 mt-2 " controlId="formGroupPassword">
        <Form.Label>Phone Number</Form.Label>
        <Form.Control type="password" placeholder="Enter Number" />
      </Form.Group>

      <Form>
      <Form.Check // prettier-ignore
        type="switch"
        id="custom-switch"
        label="by selecting "
      />
     
    </Form>z
   

       


    </Form>
        <Col xs={12} md={10} className="d-flex justify-content-center align-items-center" style={{ paddingLeft:'30px'}}>
            <Button variant="primary" type="submit" className=" w-40" >
              Register
            </Button>
            </Col>
       
      </Form>
    </Row>
    </Container>

    </>
  );
};

export default CustRegister;