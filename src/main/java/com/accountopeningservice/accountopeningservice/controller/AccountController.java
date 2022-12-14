package com.accountopeningservice.accountopeningservice.controller;

import com.accountopeningservice.accountopeningservice.model.Account;
import com.accountopeningservice.accountopeningservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    //Adder method controller with validation,inserted as a JSON object

    @PostMapping("new")
    public ResponseEntity<Account> createAccount(@Valid @RequestBody Account account){
        Account saveAccount=accountService.createAccount(account);
        return new ResponseEntity<Account>(saveAccount, HttpStatus.CREATED);
    }
    //Getter Method controller
    @GetMapping("/accounts")
    public List<Account> getAccountList(){

        return accountService.getAllAccount();
    }
    //Put/Update method Controller.
    @PutMapping("/update_account/{account_no}/{name}/{pan_no}/{aadhar_no}/{amount}")
    public String updateAccount(@PathVariable long account_no,@PathVariable String name,@PathVariable String pan_no,@PathVariable String aadhar_no,@PathVariable String amount){

        return   accountService.updateAccount(account_no,name,pan_no,aadhar_no,amount);
    }
    //Put/Update method controller via JSON object
/*    @PutMapping("update_account_body")
    public String updateAccount(@RequestBody Account account){


        return accountService.updateAccount(account);
    }*/

//Delete method Controller
@DeleteMapping("/delete_account/{account_no}")
public String deleteAccount(@PathVariable long account_no){

    return accountService.deleteAccount(account_no);
}
}
