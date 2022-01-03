import React, { Component } from 'react';
class Xyz extends Component {
   
    state = {loggedIn: this.props.lprop, x:"gfgdgdf", y:"kdfuhgdifu"};
    
    lgToggle = ()=> { this.setState({loggedIn: !(this.state.loggedIn)}); 
    console.log("bdfgdf"+this.state.x);
    }
   render() {
       return (
          <div>
        <button onClick={this.lgToggle}>{this.state.loggedIn?'Looogouttt':'Loooginnn'}</button>
          </div>
       );
    }
 }

 export default Xyz;