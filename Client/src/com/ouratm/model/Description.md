# Description of the design decisions

## Version
0.0.1

### Components:
1. User Interface:
    * This represents the interface that will be exposed to the User
    * In the starting versions, this will be text based only
2. User:
    * This represent a User
    * It should contain all different accounts this User has
    * It should also contain user information
3. Accounts:
    * Different types of accounts that have different types of properties
    * Currently there will be only two different types of account
        * Saving
        * Checking
4. Transaction:
    * There are three different type of transactions that will be supported:
        * Check Balance on an account
        * Deposit
            * Check
            * Cash
        * Withdrawl 
5. Rules:
    * Each transaction has to be vetted by rules to ensure that the transaction is valid and can be executed
    * Each rule is independent of the transaction
        * Thus diffrent types of transactions can run the same rule(s)
6. Client:
    * This is the driver
    * Currently all the rules and transactions are being handled in the client(on the ATM).<br />
    However to make this more secure, eventually all the rules and transaction will be moved to the server.<br />
    The client will just send the user request over to the server and forward the responses from the server to the user.<br />
    This *might* need a protocol for the client (ATM) to follow server's responses.

### Working:
1. The driver (Client) will instantiate the various Components
2. It takes a hardcoded transaction to process
3. Will run different set of rules based on the type of transaction
4. Iff the rules run successfully, the transaction is executed