import React from 'react';
import { 
  Container, 
  Form, 
  Button, 
  Row, 
  Col,Navbar,Nav, 
} from 'react-bootstrap';


const CustomerLogin = () => {
  return (
    <>

    <Container  style={{paddingTop:'20px' ,backgroundColor: '#DCDCDC', height: '100vh', width: '100vw'}} >
      <h1 className="text-center mx-5 my-5 " >Customer Login</h1>
      <Row className="justify-content-center mt-5 ms-5">
        <Col xs={15} md={12}></Col>    
        <Form style={{  paddingTop:'40px',paddingBottom:'30px', backgroundColor: 'white', paddingLeft:'20px', paddingRight:'10px',height:'50vh',  width:'50vh', alignItems:'center'}}>
        
          <Col >
            <Form.Group className="mb-2 px-5 " controlId="formEmail">
              <Form.Label className='mt-3'>Email address</Form.Label>
              <Form.Control type="email" placeholder="Enter email" />
            </Form.Group>
          </Col>
          
          <Row>
          <Col >
            <Form.Group className="mb-2 px-5 justify-content-center " controlId="formPassword">
              <Form.Label>Password</Form.Label>
              <Form.Control type="password" placeholder="Password" />
            </Form.Group>
          </Col>
        </Row>
        <Col xs={12} md={10} className="d-flex justify-content-center align-items-center" style={{ paddingLeft:'30px'}}>
            <Button variant="primary" type="submit" className=" w-40" >
              Login
            </Button>
            </Col>
        <Row className='justify-content-start'>
        <p className="forgot-password text-center mt-3">
          Forgot <a href="#">password?</a>
          <p className="text-center mt-3">
          Don't have an account? <a href="/register">Register here</a> </p>
        </p>

        
        
        </Row>
      </Form>
    </Row>
    </Container>

    </>
  );
};

export default CustomerLogin;