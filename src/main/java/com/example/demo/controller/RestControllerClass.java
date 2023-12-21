package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bank;
import com.example.demo.entity.Bank;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/Bank")
public class RestControllerClass {
   
static List<Bank>bank=new ArrayList<>();
 
    @GetMapping("/allBankAccounts")
    public List<Bank> Bankaccountdata()
    {
        return  bank;
    }
    @GetMapping("bankAccountById/{id}")
    public Bank getSingleRecordByID(@PathVariable int id)
    {
        for(int i=0;i<bank.size();i++)
        {
            if(bank.get(i).getAc_no()==id)
            return bank.get(i);
        }
        return null;
    }
    @DeleteMapping("DeleteAccountById/{id}")
    public void deleteRecordBank(@PathVariable int id)
    {
        for(int i=0;i<bank.size();i++)
        {
            if(bank.get(i).getAc_no()==id)
            {
                bank.remove(i);
            }
        }
    }
    @PostMapping("/addCustomer")
    public List<Bank> postMethodName(@RequestBody Bank entity) {

        entity.setAc_no(entity.getAc_no());
        entity.setC_name(entity.getC_name());
        entity.setAmount(entity.getAmount());
        bank.add(entity);
    

        //Student std=new Student(entity.getRoll() ,entity.getName(), entity.getMarks());
        //student.add(std);
        
        
        return bank;
    }
    @PutMapping("/updateCustomer/{id}")
    public List<Bank> PutMethodName(@PathVariable int id,@RequestBody Bank entity) {
        for(int i=0;i<bank.size();i++)
        {
            if(bank.get(i).getAc_no()==id)
            {
                bank.remove(i);
            }
        }
        int c=0;
        for(Bank b:bank)
        {
            if(entity.getAc_no()==b.getAc_no())
           {
                Bank newCust=new Bank(entity.getAc_no(),entity.getC_name(),entity.getAmount());
                bank.set(c,newCust);
            }
            c++;
        }

        entity.setAc_no(entity.getAc_no());
        entity.setC_name(entity.getC_name());
        entity.setAmount(entity.getAmount());
        bank.add(entity);
    

        //Student std=new Student(entity.getRoll() ,entity.getName(), entity.getMarks());
        //student.add(std);
        
        
        return bank;
    }
   
}
