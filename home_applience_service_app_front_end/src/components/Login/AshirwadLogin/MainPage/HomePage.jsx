import React from 'react'

import { Container,Nav,NavDropdown,Navbar,Image,Button, CardGroup,Card } from 'react-bootstrap'
import InstagramIcon from '@mui/icons-material/Instagram';
import PinterestIcon from '@mui/icons-material/Pinterest';
import TwitterIcon from '@mui/icons-material/Twitter';
import FacebookIcon from '@mui/icons-material/Facebook';

export const HomePage = () => {
  return (
    <>
    <Navbar collapseOnSelect expand="lg" className="bg-body-tertiary sticky-top" bg="success" data-bs-theme='success'>
      <Container>
       
       
      <Navbar.Brand href="#home">Application</Navbar.Brand>
        <Navbar.Toggle aria-controls="responsive-navbar-nav" />
        <Navbar.Collapse id="responsive-navbar-nav">
        
          <Nav className="me-auto"></Nav>
          
          <Nav className='justify-content-end '>
            <Nav.Link href="#deets">Home</Nav.Link>
            <Nav.Link href="#deets">Service</Nav.Link>            
            <Nav.Link href="#deets">About</Nav.Link>
            <Navbar.Collapse className="justify-content-end">
          <Navbar.Text>
          <Button variant="primary" size="sm">Singup</Button>
          </Navbar.Text>
        </Navbar.Collapse>
            
            
         

          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
    
     <nav className='md-2'>
        <Image
          Image src="https://homeappliancesrepairs.co.uk/wp-content/uploads/2017/11/services-1140x597.jpg" alt="Your Image" style={{ width: '100%', height:'100vh',filter: 'brightness(50%)'}}/>
          <div style={{ position: 'absolute',fontFamily:'initial',fontStretch:'extra-expanded', fontStyle:'normal',fontWeight:'lighter', top: '50%', left: '50%', transform: 'translate(-50%, -50%)', color: 'white', textAlign: 'center' }}>
              <h1>Easy, Reliable and Affordable Services</h1>
              <p>for all home appliances, mobile and furniture</p>
           
              <Button variant="outline-light">View More</Button>{' '}
 </div>
 </nav>
 <br/>
 
 <Nav className='d-flex justify-content-center ms-5 my-5 '>
      <div className='text-primary' text-primary-emphasis>
      <h1>Solutions for your home</h1>
   <p> We Service All Home Appliances, Electronics, Mobile & Furnitures</p>
 </div>
     </Nav>

<CardGroup >

    <Nav className='justify-content ms-4 my4'>
    <Card border="primary" bg='primary' style={{ width: '18rem', margin: '0 10px' }}>
        {/* <Card.Header>Header</Card.Header> */}
        <Card.Body>
          <Card.Title className='text-light'><svg xmlns="http://www.w3.org/2000/svg" width="50" height="50" fill="currentColor" class="bi bi-tools" viewBox="0 0 16 16">
  <path d="M1 0 0 1l2.2 3.081a1 1 0 0 0 .815.419h.07a1 1 0 0 1 .708.293l2.675 2.675-2.617 2.654A3.003 3.003 0 0 0 0 13a3 3 0 1 0 5.878-.851l2.654-2.617.968.968-.305.914a1 1 0 0 0 .242 1.023l3.27 3.27a.997.997 0 0 0 1.414 0l1.586-1.586a.997.997 0 0 0 0-1.414l-3.27-3.27a1 1 0 0 0-1.023-.242L10.5 9.5l-.96-.96 2.68-2.643A3.005 3.005 0 0 0 16 3q0-.405-.102-.777l-2.14 2.141L12 4l-.364-1.757L13.777.102a3 3 0 0 0-3.675 3.68L7.462 6.46 4.793 3.793a1 1 0 0 1-.293-.707v-.071a1 1 0 0 0-.419-.814zm9.646 10.646a.5.5 0 0 1 .708 0l2.914 2.915a.5.5 0 0 1-.707.707l-2.915-2.914a.5.5 0 0 1 0-.708M3 11l.471.242.529.026.287.445.445.287.026.529L5 13l-.242.471-.026.529-.445.287-.287.445-.529.026L3 15l-.471-.242L2 14.732l-.287-.445L1.268 14l-.026-.529L1 13l.242-.471.026-.529.445-.287.287-.445.529-.026z"/>
</svg>Protect</Card.Title>
          <Card.Text className='text-light'>
          Our Extended Warranty plans secure your products from defects & failures, year after year. Huge cost savings & longer product life guaranteed.
          </Card.Text>
        </Card.Body>
      </Card>
      <br />

      <Card border="primary" bg='primary' style={{ width: '18rem', margin: '0 10px' }}>
        {/* <Card.Header className='text-light'>Install</Card.Header> */}
        <Card.Body>
          <Card.Title className='text-white'><svg xmlns="http://www.w3.org/2000/svg" width="50" height="50" fill="currentColor" class="bi bi-house" viewBox="0 0 16 16">
  <path d="M8.707 1.5a1 1 0 0 0-1.414 0L.646 8.146a.5.5 0 0 0 .708.708L2 8.207V13.5A1.5 1.5 0 0 0 3.5 15h9a1.5 1.5 0 0 0 1.5-1.5V8.207l.646.647a.5.5 0 0 0 .708-.708L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293zM13 7.207V13.5a.5.5 0 0 1-.5.5h-9a.5.5 0 0 1-.5-.5V7.207l5-5z"/>
</svg>   InstallSecondary</Card.Title>
          <Card.Text className='text-light'>
          We'll get your products installed,
           configured and ready to use at your home.
            Your convenience guaranteed.
          </Card.Text>
        </Card.Body>
      </Card>
      <br />

      <Card border="primary" bg='primary' style={{ width: '18rem', margin: '0 10px' }}>
        {/* <Card.Header>Header</Card.Header> */}
        <Card.Body>
          <Card.Title className='text-light'> <svg xmlns="http://www.w3.org/2000/svg" width="50" height="50" fill="currentColor" class="bi bi-tools" viewBox="0 0 16 16">
  <path d="M1 0 0 1l2.2 3.081a1 1 0 0 0 .815.419h.07a1 1 0 0 1 .708.293l2.675 2.675-2.617 2.654A3.003 3.003 0 0 0 0 13a3 3 0 1 0 5.878-.851l2.654-2.617.968.968-.305.914a1 1 0 0 0 .242 1.023l3.27 3.27a.997.997 0 0 0 1.414 0l1.586-1.586a.997.997 0 0 0 0-1.414l-3.27-3.27a1 1 0 0 0-1.023-.242L10.5 9.5l-.96-.96 2.68-2.643A3.005 3.005 0 0 0 16 3q0-.405-.102-.777l-2.14 2.141L12 4l-.364-1.757L13.777.102a3 3 0 0 0-3.675 3.68L7.462 6.46 4.793 3.793a1 1 0 0 1-.293-.707v-.071a1 1 0 0 0-.419-.814zm9.646 10.646a.5.5 0 0 1 .708 0l2.914 2.915a.5.5 0 0 1-.707.707l-2.915-2.914a.5.5 0 0 1 0-.708M3 11l.471.242.529.026.287.445.445.287.026.529L5 13l-.242.471-.026.529-.445.287-.287.445-.529.026L3 15l-.471-.242L2 14.732l-.287-.445L1.268 14l-.026-.529L1 13l.242-.471.026-.529.445-.287.287-.445.529-.026z"/>
</svg>Fix</Card.Title>
          <Card.Text className='text-light'>
          Our awesome service experts can fix any product problem, from regular maintenance to complete breakdowns. Peace of mind guaranteed.
          </Card.Text>
        </Card.Body>
      </Card>
      <br />
      </Nav>
</CardGroup>


<br />
    <div className='d-flex justify-content-center align-items-center'>
    <PinterestIcon style={{  marginLeft: '20px' }}></PinterestIcon>
    <FacebookIcon style={{  marginLeft: '20px' }}></FacebookIcon>
    <TwitterIcon style={{  marginLeft: '20px' }}></TwitterIcon>
    <InstagramIcon style={{  marginLeft: '20px' }}></InstagramIcon>
    </div>
<br />
    <p className='d-flex justify-content-center align-items-center' style={{ fontFamily:'serif', fontStyle:'normal', fontWeight:'lighter', fontSize:'10px', textJustify:'inter-character'}}>&copy; {new Date().getFullYear(2035)} By The Art of Food. Powered and secured by 
    <a style={{ color:'black', marginLeft: '5px' }} href='#'>Wix</a></p>


    



    </>
    
  )
}
