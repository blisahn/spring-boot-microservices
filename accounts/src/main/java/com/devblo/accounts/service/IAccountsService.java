package com.devblo.accounts.service;

import com.devblo.accounts.dto.CustomerDto;

/**
 * @author blisahn 06.03.2024
 */
public interface IAccountsService {

    /**
     * @param customerDto-CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);


    /**
     * @param mobileNumber - mobileNumber for querying
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * @param customerDto - CustomerDto Object
     * @return boolean indicating if the update of account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the update of account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
