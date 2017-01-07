insert into permission(id, name, description,created_date, last_modified_date) values(1,'READ_CUSTOMER','Permission to read customer data',  now(), now());
insert into permission(id, name, description,created_date, last_modified_date) values(2,'WRITE_CUSTOMER','Permission to write customer data',  now(), now());
insert into permission(id, name, description,created_date, last_modified_date) values(3,'UPDATE_CUSTOMER','Permission to update customer data',  now(), now());

insert into role(id, name, description, created_date, last_modified_date) values(1,'Admin','Admin Role', now(), now());

insert into role_permission(id, role_id, permission_id, created_date, last_modified_date) values(1,1,1,now(), now());
insert into role_permission(id, role_id, permission_id, created_date, last_modified_date) values(2,1,2,now(), now());
insert into role_permission(id, role_id, permission_id, created_date, last_modified_date) values(3,1,3,now(), now());

insert into user(id, user_name, password, preference, created_date, last_modified_date) values(1,'zhouqi','zhou215',NULL, now(), now());

insert into user_role(id, user_id, role_id, created_date, last_modified_date) values (1,1,1, now(), now());
 
