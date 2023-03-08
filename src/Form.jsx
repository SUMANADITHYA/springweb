import React, {useState} from 'react';
// import './Form.css';



function Form() {
	const [Id, setId] = useState('');
	const [name , setName] = useState('');
	const [member, setMember] = useState('');
	const [Phone, setPhone] = useState('');
	const [email , setEmail] = useState('');
	const [password , setPassword] = useState('');

	const handleIdChange = (e)=>{
	 setId(e.target.value);
	}

	const handleChange =(e)=>{
	setName(e.target.value);
	}

	const handleMemberChange =(e)=>{
		setMember(e.target.value);
	}

	const handlePhoneChange =(e)=>{
	setPhone(e.target.value);
	}
	
	const handleEmailChange =(e)=>{
	setEmail(e.target.value);
	}
	
	const handlePasswordChange =(e)=>{
	setPassword(e.target.value);
	}
	
	// const handleConfPasswordChange =(e)=>{
	// setConfPassword(e.target.value);
	// }

	// const handleSubmit=(e)=>{
	// if(password!=confPassword)
	// {
	
	// 	alert("password Not Match");
	// }
	// else{
	
	// 	alert('A form was submitted with Name :"' + name +
	// 	'" ,Age :"'+age +'" and Email :"' + email + '"');
	// }
	// e.preventDefault();

	// }
return (
	<div className="App">
	<header className="App-header">
	<form>
	
	<h2> HOTEL LEIMERDIAN</h2>
	<h3> BOOKING </h3>
		<label >
		Id;
		</label><br/>
		<input type="text" value={Id} required onChange={(e)=> {handleIdChange(e)}} /><br/>
		<label >
		Name:
		</label><br/>
		<input type="text" value={name} required onChange={(e)=> {handleChange(e)}} /><br/>
		
		<label >
		Members:
		</label><br/>
		<input type="number" value={member} required onChange={(e)=> {handleMemberChange(e)}} /><br/>
		
		<label >
		Phone:
		</label><br/>
		<input type="text" value={Phone} required onChange={(e)=> {handlePhoneChange(e)}} /><br/>
			
		<label>
		Email:
		</label><br/>
		<input type="email" value={email} required onChange={(e)=> {handleEmailChange(e)}} /><br/>
		
		<label>
		Password:
		</label><br/>
		<input type="password" value={password} required onChange={(e)=> {handlePasswordChange(e)}} /><br/>
		
		{/* <label>
		Confirm Password:
		</label><br/>
		<input type="password" value={confPassword} required onChange={(e)=> {handleConfPasswordChange(e)}} /><br/> */}
			
		<input type="submit" value="Submit"/>
	</form>
	</header>
	</div>
);
}

export default Form;
