insert into users(username,password,enabled)
	values('admin','$2a$11$7pTxzawy.r24QAcvXiCw2.04p1ESg9jhWDahkqUQujM2haAr7Ay5e',true);
insert into authorities(username,authority) 
	values('admin','ROLE_ADMIN');