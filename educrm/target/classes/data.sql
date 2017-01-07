--- stored procedure ---
DROP PROCEDURE IF EXISTS staff_hierarchy
/;
CREATE PROCEDURE staff_hierarchy (IN inId long, OUT pr VARCHAR(20))
BEGIN
	SELECT GROUP_CONCAT(lv SEPARATOR ',') hier INTO pr FROM (
	SELECT @pv:=(SELECT GROUP_CONCAT(id SEPARATOR ',') FROM Staff WHERE 
	FIND_IN_SET(superior_id, @pv)) AS lv FROM Staff
	JOIN
	(SELECT @pv:=inId)tmp
	WHERE 
	FIND_IN_SET(superior_id, @pv)) a;
END /;

-- default source
INSERT INTO sales_source(ID, DESCRIPTION, created_date, last_modified_date, created_by, last_modified_by) VALUES (1, '营销活动', now(), now(), 1, 1)/;
INSERT INTO sales_source(ID, DESCRIPTION, created_date, last_modified_date, created_by, last_modified_by) VALUES (2, '电话咨询', now(), now(), 1, 1)/;
INSERT INTO sales_source(ID, DESCRIPTION, created_date, last_modified_date, created_by, last_modified_by) VALUES (3, '网络咨询', now(), now(), 1, 1)/;
INSERT INTO sales_source(ID, DESCRIPTION, created_date, last_modified_date, created_by, last_modified_by) VALUES (4, '路演', now(), now(), 1, 1)/;
INSERT INTO sales_source(ID, DESCRIPTION, created_date, last_modified_date, created_by, last_modified_by) VALUES (5, '其它', now(), now(), 1, 1)/;

--default reason
INSERT INTO sales_reason(ID, DESCRIPTION, VERSION, created_date, last_modified_date, created_by, last_modified_by) VALUES (1, '价格', 1, now(), now(), 1, 1)/;
INSERT INTO sales_reason(ID, DESCRIPTION, VERSION, created_date, last_modified_date, created_by, last_modified_by) VALUES (2, '竞争者', 1, now(), now(), 1, 1)/;
INSERT INTO sales_reason(ID, DESCRIPTION, VERSION, created_date, last_modified_date, created_by, last_modified_by) VALUES (3, '产品', 1, now(), now(), 1, 1)/;
INSERT INTO sales_reason(ID, DESCRIPTION, VERSION, created_date, last_modified_date, created_by, last_modified_by) VALUES (4, '交货日期', 1, now(), now(), 1, 1)/;
INSERT INTO sales_reason(ID, DESCRIPTION, VERSION, created_date, last_modified_date, created_by, last_modified_by) VALUES (5, '未给出/未指明', 1, now(), now(), 1, 1)/;

--default stage
INSERT INTO stage(ID, NAME, STAGE_NO, CLOSING_PERCENTAGE, ACTIVE, VERSION, created_date, last_modified_date, created_by, last_modified_by) VALUES (1, '评估销售机会', 1, 6, 1, 1, now(), now(), 1, 1)/;
INSERT INTO stage(ID, NAME, STAGE_NO, CLOSING_PERCENTAGE, ACTIVE, VERSION, created_date, last_modified_date, created_by, last_modified_by) VALUES (2, '第一次客户拜访', 2, 20, 1, 1, now(), now(), 1, 1)/;
INSERT INTO stage(ID, NAME, STAGE_NO, CLOSING_PERCENTAGE, ACTIVE, VERSION, created_date, last_modified_date, created_by, last_modified_by) VALUES (3, '第二次客户拜访', 3, 50, 1, 1, now(), now(), 1, 1)/;
INSERT INTO stage(ID, NAME, STAGE_NO, CLOSING_PERCENTAGE, ACTIVE, VERSION, created_date, last_modified_date, created_by, last_modified_by) VALUES (4, '销售报价', 4, 60, 1, 1, now(), now(), 1, 1)/;
INSERT INTO stage(ID, NAME, STAGE_NO, CLOSING_PERCENTAGE, ACTIVE, VERSION, created_date, last_modified_date, created_by, last_modified_by) VALUES (5, '谈判', 5, 80, 1, 1, now(), now(), 1, 1)/;
INSERT INTO stage(ID, NAME, STAGE_NO, CLOSING_PERCENTAGE, ACTIVE, VERSION, created_date, last_modified_date, created_by, last_modified_by) VALUES (6, '销售订单', 6, 95, 1, 1, now(), now(), 1, 1)/;

insert into memo(id, title, type, content, source_id, source_type, created_date, last_modified_date, created_by, last_modified_by) values (1, "call A", "IMPORTANT", "call A", 1, "LEAD", now(), now(), 1, 1)/;
insert into memo(id, title, type, content, source_id, source_type, created_date, last_modified_date, created_by, last_modified_by) values (2, "call B", "IMPORTANT", "call B", 1, "LEAD", now(), now(), 1, 1)/;

insert into staff(id, name, superior_id, created_date, last_modified_date, created_by, last_modified_by) values(1, "Wang Jun", null, now(), now(), 1, 1)/; 
insert into staff(id, name, superior_id, created_date, last_modified_date, created_by, last_modified_by) values(2, "Level1", 1, now(), now(), 1, 1)/; 
insert into staff(id, name, superior_id, created_date, last_modified_date, created_by, last_modified_by) values(3, "Level21", 2, now(), now(), 1, 1)/; 
insert into staff(id, name, superior_id, created_date, last_modified_date, created_by, last_modified_by) values(4, "Level22", 2, now(), now(), 1, 1)/; 
insert into staff(id, name, superior_id, created_date, last_modified_date, created_by, last_modified_by) values(5, "Level31", 4, now(), now(), 1, 1)/; 
insert into staff(id, name, superior_id, created_date, last_modified_date, created_by, last_modified_by) values(6, "Level41", 5, now(), now(), 1, 1)/; 
insert into staff(id, name, superior_id, created_date, last_modified_date, created_by, last_modified_by) values(7, "Level42", 5, now(), now(), 1, 1)/; 
insert into staff(id, name, superior_id, created_date, last_modified_date, created_by, last_modified_by) values(8, "Level51", 7, now(), now(), 1, 1)/; 

insert into industry(id, name, created_date, last_modified_date, created_by, last_modified_by) values(1, "专业服务业", now(), now(), 1, 1)/; 
insert into industry(id, name, created_date, last_modified_date, created_by, last_modified_by) values(2, "计算机制造", now(), now(), 1, 1)/; 
insert into industry(id, name, created_date, last_modified_date, created_by, last_modified_by) values(3, "电子商务", now(), now(), 1, 1)/; 
insert into industry(id, name, created_date, last_modified_date, created_by, last_modified_by) values(4, "化工行业", now(), now(), 1, 1)/; 
insert into industry(id, name, created_date, last_modified_date, created_by, last_modified_by) values(5, "连锁分销", now(), now(), 1, 1)/; 
insert into industry(id, name, created_date, last_modified_date, created_by, last_modified_by) values(6, "教育行业", now(), now(), 1, 1)/; 
insert into industry(id, name, created_date, last_modified_date, created_by, last_modified_by) values(7, "互联网行业", now(), now(), 1, 1)/; 
insert into industry(id, name, created_date, last_modified_date, created_by, last_modified_by) values(8, "机械制造", now(), now(), 1, 1)/; 
insert into industry(id, name, created_date, last_modified_date, created_by, last_modified_by) values(9, "医疗行业", now(), now(), 1, 1)/; 

insert into state(id, name, created_date, last_modified_date, created_by, last_modified_by) values (1, '上海', now(), now(), 1, 1)/;
insert into state(id, name, created_date, last_modified_date, created_by, last_modified_by) values (2, '北京', now(), now(), 1, 1)/;
insert into state(id, name, created_date, last_modified_date, created_by, last_modified_by) values (3, '河北省', now(), now(), 1, 1)/;
insert into state(id, name, created_date, last_modified_date, created_by, last_modified_by) values (4, '浙江省', now(), now(), 1, 1)/;


insert into city(id, state_id, name, created_date, last_modified_date, created_by, last_modified_by) values (1,1, '上海', now(), now(), 1, 1)/;
insert into city(id, state_id, name, created_date, last_modified_date, created_by, last_modified_by) values (2,2, '北京', now(), now(), 1, 1)/;
insert into city(id, state_id, name, created_date, last_modified_date, created_by, last_modified_by) values (3,3, '太原', now(), now(), 1, 1)/;
insert into city(id, state_id, name, created_date, last_modified_date, created_by, last_modified_by) values (4,3, '石家庄', now(), now(), 1, 1)/;
insert into city(id, state_id, name, created_date, last_modified_date, created_by, last_modified_by) values (5,4, '宁波', now(), now(), 1, 1)/;
insert into city(id, state_id, name, created_date, last_modified_date, created_by, last_modified_by) values (6,4, '杭州', now(), now(), 1, 1)/;

insert into customer(id, code, customer_stage, address, active, industry_id, description, email_address, name, age, phone_number,  staff_id, city_id, created_date, last_modified_date, created_by, last_modified_by) values(1,"000000001","Dealed", "Chenhui Rd 1001, Shanghai, China",1, 2, "my first customer", "a1@b.com","Name1", 18, "131123121",1, 1, now(), now(), 1, 1)/;
insert into customer(id, code, customer_stage, address, active, industry_id, description, email_address, name, age, phone_number,  staff_id, city_id, created_date, last_modified_date, created_by, last_modified_by) values(2,"000000002","Potential","Chenhui Rd 1001, Shanghai, China",1, 2, "my first customer", "a1@b.com","Name2", 18, "131123121",1, 2, now(), now(), 1, 1)/;
insert into customer(id, code, customer_stage, address, active, industry_id, description, email_address, name, age, phone_number,  staff_id, city_id, created_date, last_modified_date, created_by, last_modified_by) values(3,"000000003","Dealed","Chenhui Rd 1001, Shanghai, China",1, 1, "my first customer", "a1@b.com","Name3", 18, "131123121",1, 1, now(), now(), 1, 1)/;
insert into customer(id, code, customer_stage, address, active, industry_id, description, email_address, name, age, phone_number,  staff_id, city_id, created_date, last_modified_date, created_by, last_modified_by) values(4,"000000004","Potential", "Chenhui Rd 1001, Shanghai, China",1, 1, "my first customer", "a1@b.com","Name4", 18, "131123121",1, 2, now(), now(), 1, 1)/;
insert into customer(id, code, customer_stage, address, active, industry_id, description, email_address, name, age, phone_number,  staff_id, city_id, created_date, last_modified_date, created_by, last_modified_by) values(5,"000000005","Dealed", "Chenhui Rd 1001, Shanghai, China",1, 1, "my first customer", "a1@b.com","Name5", 18, "131123121",1, 1, now(), now(), 1, 1)/;
insert into customer(id, code, customer_stage, address, active, industry_id, description, email_address, name, age, phone_number,  staff_id, city_id, created_date, last_modified_date, created_by, last_modified_by) values(6,"000000006","Dealed","Chenhui Rd 1001, Shanghai, China",1, 1, "my first customer", "a1@b.com","Name6", 18, "131123121",1, 1, now(), now(), 1, 1)/;
insert into customer(id, code, customer_stage, address, active, industry_id, description, email_address, name, age, phone_number,  staff_id, city_id, created_date, last_modified_date, created_by, last_modified_by) values(7,"000000007","Dealed", "Chenhui Rd 1001, Shanghai, China",1, 1, "my first customer", "a1@b.com","Name7", 18, "131123121",1, 1, now(), now(), 1, 1)/;
insert into customer(id, code, customer_stage, address, active, industry_id, description, email_address, name, age, phone_number,  staff_id, city_id, created_date, last_modified_date, created_by, last_modified_by) values(8,"000000008","Dealed" ,"Chenhui Rd 1001, Shanghai, China",1, 1, "my first customer", "a1@b.com","Name8", 18, "131123121",1, 1, now(), now(), 1, 1)/;
insert into customer(id, code, customer_stage, address, active, industry_id, description, email_address, name, age, phone_number,  staff_id, city_id, created_date, last_modified_date, created_by, last_modified_by) values(9,"000000009","Dealed" ,"Chenhui Rd 1001, Shanghai, China",1, 1, "my first customer", "a1@b.com","Name9", 18, "131123121",1, 1, now(), now(), 1, 1)/;
insert into customer(id, code, customer_stage, address, active, industry_id, description, email_address, name, age, phone_number,  staff_id, city_id, created_date, last_modified_date, created_by, last_modified_by) values(10,"000000010","Dealed" ,"Chenhui Rd 1001, Shanghai, China",1, 1, "my first customer", "a1@b.com","Name10", 18, "131123121",1, 1, now(), now(), 1, 1)/;
insert into customer(id, code, customer_stage, address, active, industry_id, description, email_address, name, age, phone_number,  staff_id, city_id, created_date, last_modified_date, created_by, last_modified_by) values(11,"000000011" ,"Dealed","Chenhui Rd 1001, Shanghai, China",1, 1, "my first customer", "a1@b.com","Name11", 18, "131123121",1, 1, now(), now(), 1, 1)/;
insert into customer(id, code, customer_stage, address, active, industry_id, description, email_address, name, age, phone_number,  staff_id, city_id, created_date, last_modified_date, created_by, last_modified_by) values(12,"000000012" ,"Dealed","Wangfujing Rd 23, Beijing, China",1, 1, "my second customer", "a1@b.com","Name2", 18, "13343443",1, 1, now(), now(), 1, 1)/;

insert into contact_person(id, name, created_date, last_modified_date, created_by, last_modified_by) values (1, 'zhouqi', now(), now(), 1, 1)/;
insert into contact_person(id, name, created_date, last_modified_date, created_by, last_modified_by) values (2, 'chenkang', now(), now(), 1, 1)/;

insert into customer_contact(id, customer_id, contactperson_id,  created_date, last_modified_date, created_by, last_modified_by) values (1, 1, 1,  now(), now(), 1, 1)/;
insert into customer_contact(id, customer_id, contactperson_id,  created_date, last_modified_date, created_by, last_modified_by) values (2, 1, 2,  now(), now(), 1, 1)/;

insert into target_group
(`id`, `created_by`, `created_date`, `last_modified_by`, `last_modified_date`, `version`, `code`, `description`, `group_member_number`, `name`, `status`)
values
(1, 1, now(), 1, now(), 1, "t001", "rich people", 3, "rich people", "ACTIVE")/;

insert into target_group
(`id`, `created_by`, `created_date`, `last_modified_by`, `last_modified_date`, `version`, `code`, `description`, `group_member_number`, `name`, `status`)
values
(2, 1, now(), 1, now(), 1, "t001", "IT guys", 3, "IT guys", "ACTIVE")/;


insert into category(id, parent_category_id, name, description, code, leaf, created_date, last_modified_date, created_by, last_modified_by) value(1, null, "ielts", "ielts", "c001", 0, now(), now(), 1, 1)/;
insert into category(id, parent_category_id, name, description, code, leaf, created_date, last_modified_date, created_by, last_modified_by) value(2, 1, "ielts 6.5", "ielts 6.5", "c001", 1, now(), now(), 1, 1)/;

insert into product(id, code, name, description, created_date, last_modified_date, created_by, last_modified_by) values(1,"P001","P001", "AAAAA", now(), now(), 1, 1)/;
insert into product(id, code, name, description, created_date, last_modified_date, created_by, last_modified_by) values(2,"P002","P002", "BBBBB", now(), now(), 1, 1)/;

insert into product_bundle (id, code, name, price, total_time_in_hours, category_id, start_time, end_time, created_date, last_modified_date, created_by, last_modified_by) values (1,"PB001","PB001", 1, 40, 1, "2015-01-01 00:00:00", "2015-12-31 00:00:00",now(), now(), 1, 1)/;
insert into product_bundle (id, code, name, price, total_time_in_hours, category_id, start_time, end_time, created_date, last_modified_date, created_by, last_modified_by) values (2,"PB002","PB002", 2, 100, 1, "2015-01-01 00:00:00", "2015-12-31 00:00:00",now(), now(), 1, 1)/;
insert into product_bundle (id, code, name, price, total_time_in_hours, category_id, start_time, end_time, created_date, last_modified_date, created_by, last_modified_by) values (3,"PB003","PB003", 3, 100, 1, "2015-01-01 00:00:00", "2015-12-31 00:00:00",now(), now(), 6, 6)/;

insert into product_bundle_item (id, product_bundle_id, product_id, created_date, last_modified_date, created_by, last_modified_by) values (1,1,1,now(), now(), 1, 1)/;
insert into product_bundle_item (id, product_bundle_id, product_id, created_date, last_modified_date, created_by, last_modified_by) values (2,1,2,now(), now(), 1, 1)/;



insert into campaign(id, name, start_date, end_date, description, created_date, last_modified_date, created_by, last_modified_by) values(1,"国庆促销活动", now(), now(), "国庆促销活动", now(), now(), 1, 1)/;
insert into campaign(id, name, start_date, end_date, description, created_date, last_modified_date, created_by, last_modified_by) values(2,"开业大典", now(), now(), "开业大典", now(), now(), 1, 1)/;

insert into lead(id, customer_id, description, level, status, source_id, source_type, created_date, last_modified_date, created_by, last_modified_by) values(1, 1, "jiahao want to learn ielts", "COLD", "OPEN", 1, "CAMPAIGN", now(), now(), 1, 1)/;
insert into lead(id, customer_id, description, level, status, source_id, source_type, created_date, last_modified_date, created_by, last_modified_by) values(2, 2, "kang want to learn ielts", "COLD", "OPEN", 2, "CAMPAIGN", now(), now(), 1, 1)/;

insert into opportunity(id, customer_id, description, start_date, potential_amount, status, source_id, source_type, created_date, last_modified_date, created_by, last_modified_by)
values(1, 1, "jiahao want to learn ielts", now(), 12, "OPEN", 1, "CAMPAIGN", now(), now(), 1, 1)/;
insert into opportunity_line(id,  opportunity_id, line_number, product_bundle_id, quantity, unit_price, line_total, created_date, last_modified_date, created_by, last_modified_by)
values(1, 1, 1, 1, 2, 30000, 60000, now(), now(), 1, 1)/;
insert into opportunity_line(id,  opportunity_id, line_number, product_bundle_id, quantity, unit_price, line_total, created_date, last_modified_date, created_by, last_modified_by)
values(2, 1, 2, 2, 2, 30000, 60000, now(), now(), 1, 1)/;

insert into opportunity(id, customer_id, description, start_date, potential_amount, status, source_id, source_type, created_date, last_modified_date, created_by, last_modified_by)
values(2, 2, "chenkang want to learn ielts", now(), 12, "OPEN", 1, "CAMPAIGN", now(), now(), 1, 1)/;
insert into opportunity_line(id,  opportunity_id, line_number, product_bundle_id, quantity, unit_price, line_total, created_date, last_modified_date, created_by, last_modified_by)
values(3, 2, 1, 1, 2, 30000, 60000, now(), now(), 1, 1)/;
insert into opportunity_line(id,  opportunity_id, line_number, product_bundle_id, quantity, unit_price, line_total, created_date, last_modified_date, created_by, last_modified_by)
values(4, 2, 2, 2, 2, 30000, 60000, now(), now(), 1, 1)/;

insert into quotation (id,discount_percent,expire_date,quotation_date,remark,source_id,source_type,total_amount,customer_id,created_by,created_date,last_modified_by,last_modified_date,version)
 values (1, 0.8, now(), now(), "aaa", 1, "CAMPAIGN", 800, 1, 1, now(), 1, now(), 1)/;
insert into quotation (id,discount_percent,expire_date,quotation_date,remark,source_id,source_type,total_amount,customer_id,created_by,created_date,last_modified_by,last_modified_date,version)
 values (2, 0.8, now(), now(), "aaa", 1, "CAMPAIGN", 800, 1, 1, now(), 1, now(), 1)/;
 

INSERT INTO sales_order
(`id`, `created_by`, `created_date`, `last_modified_by`, `last_modified_date`, `version`, `code`, `discount_percent`, `external_order_id`, `remark`, `sales_order_date`, `source_id`, `source_type`, `total_amount`, `customer_id`, `staff_id`)
VALUES
(1, 1, now(), 1, now(), 1, "s001", 0.8, "80976787", "deal", now(), 1, "CAMPAIGN", 80, 1, 1)/;

INSERT INTO sales_order
(`id`, `created_by`, `created_date`, `last_modified_by`, `last_modified_date`, `version`, `code`, `discount_percent`, `external_order_id`, `remark`, `sales_order_date`, `source_id`, `source_type`, `total_amount`, `customer_id`, `staff_id`)
VALUES
(2, 1, now(), 1, now(), 1, "s001", 0.8, "80976787", "deal", now(), 1, "CAMPAIGN", 80, 1, 1)/;
 
insert into partner(id, code, name, description, email_address, phone_number, created_date, last_modified_date, created_by, last_modified_by) values(1,"P001", "朗阁雅思", "朗阁雅思", "a1@b.com", "131123121", now(), now(), 1, 1)/;
insert into partner(id, code, name, description, email_address, phone_number, created_date, last_modified_date, created_by, last_modified_by) values(2,"P002", "剑桥英语", "剑桥英语","a1@b.com", "13343443", now(), now(), 1, 1)/;

insert into activity(id, subject, description, type, created_date, last_modified_date, created_by, last_modified_by) values (1, "play together", "play together", "APPOINTMENT", now(), now(), 1, 1)/;
insert into activity(id, subject, description, type, created_date, last_modified_date, created_by, last_modified_by) values (2, "meeting", "meeting", "APPOINTMENT", now(), now(), 1, 1)/;

insert into activity_related_participant(id, activity_id, source_id, source_type, created_date, last_modified_date, created_by, last_modified_by) values (1, 1, 1, "CAMPAIGN", now(), now(), 1, 1)/;
insert into activity_related_participant(id, activity_id, source_id, source_type, created_date, last_modified_date, created_by, last_modified_by) values (2, 1, 2, "CAMPAIGN", now(), now(), 1, 1)/;

insert into activity_related_document(id, activity_id, source_id, source_type, created_date, last_modified_date, created_by, last_modified_by) values (1, 2, 1, "CAMPAIGN", now(), now(), 1, 1)/;
insert into activity_related_document(id, activity_id, source_id, source_type, created_date, last_modified_date, created_by, last_modified_by) values (2, 2, 2, "CAMPAIGN", now(), now(), 1, 1)/;

insert into district(id, name, created_date, last_modified_date, created_by, last_modified_by) values (1, "黄浦区", now(), now(), 1, 1)/;
insert into district(id, name, created_date, last_modified_date, created_by, last_modified_by) values (2, "浦东新区", now(), now(), 1, 1)/;

insert into class_room(id, code,name,min_qty,max_qty,description,address,room_type,has_projector,district_id,created_date, last_modified_date, created_by, last_modified_by)
values(1, "CLSRM001","A208",1,20,"VIA会议室","上海浦东新区金科路VIA,A栋2楼","MULTIMEDIA",true,2,now(), now(), 1, 1)/;

insert into class_room(id, code,name,min_qty,max_qty,description,address,room_type,has_projector,district_id,created_date, last_modified_date, created_by, last_modified_by)
values(2, "CLSRM002","A105",1,40,"VIA培训室","上海浦东新区金科路VIA,A栋1楼","NORMAL",true,2,now(), now(), 1, 1)/;

insert into class_room(id, code,name,min_qty,max_qty,description,address,room_type,has_projector,district_id,created_date, last_modified_date, created_by, last_modified_by)
values(3, "CLSRM003","B208",1,20,"KIA会议室","上海徐汇区马当路KIA,B栋2楼","MULTIMEDIA",true,1,now(), now(), 1, 1)/;

insert into class_room(id, code,name,min_qty,max_qty,description,address,room_type,has_projector,district_id,created_date, last_modified_date, created_by, last_modified_by)
values(4, "CLSRM004","B105",1,40,"KIA培训室","上海徐汇区马当路KIA,B栋1楼","NORMAL",true,1,now(), now(), 1, 1)/;

insert into edu_class(id, code, name, min_qty, max_qty, start_date, end_date, description, class_type, product_bundle_id, created_date, last_modified_date, created_by, last_modified_by)
values(1, "CLS001", "雅思暑期班", 1, 20, "2015-07-01", "2015-09-30", "雅思暑期培训1班", "SUMMERCOURSE",1,now(), now(), 1, 1)/;

insert into schedule(id,start_date, end_date, class_id, product_id, room_id, teacher_id, created_date, last_modified_date, created_by, last_modified_by)
values(1,"2015-07-01 9:30:00", "2015-07-01 10:30:00", 1, 1, 1, 1, now(), now(), 1, 1)/;

insert into test values(1,'aaa')/;

insert into language(id, code, name, created_date, last_modified_date, created_by, last_modified_by) values (1,'CHINESE', '中文', now(), now(), 1, 1)/;
insert into language(id, code, name, created_date, last_modified_date, created_by, last_modified_by) values (2,'ENGLISH', '英语', now(), now(), 1, 1)/;
insert into language(id, code, name, created_date, last_modified_date, created_by, last_modified_by) values (3,'FRENCH', '法语', now(), now(), 1, 1)/;
insert into language(id, code, name, created_date, last_modified_date, created_by, last_modified_by) values (4,'GERMAN', '德语', now(), now(), 1, 1)/;
insert into language(id, code, name, created_date, last_modified_date, created_by, last_modified_by) values (5,'JAPANESE', '日语', now(), now(), 1, 1)/;

insert into country(id, code, name, created_date, last_modified_date, created_by, last_modified_by) values (1,'China', '中国', now(), now(), 1, 1)/;
insert into country(id, code, name, created_date, last_modified_date, created_by, last_modified_by) values (2,'Hong Kong', '中国香港', now(), now(), 1, 1)/;
insert into country(id, code, name, created_date, last_modified_date, created_by, last_modified_by) values (3,'Germany', '德国', now(), now(), 1, 1)/;
insert into country(id, code, name, created_date, last_modified_date, created_by, last_modified_by) values (4,'America', '美国', now(), now(), 1, 1)/;
insert into country(id, code, name, created_date, last_modified_date, created_by, last_modified_by) values (5,'England', '英国', now(), now(), 1, 1)/;

insert into permission(id, name, description,created_date, last_modified_date, created_by, last_modified_by) values(1,'READ_CUSTOMER','Permission to read customer data',  now(), now(), 1, 1)/;
insert into permission(id, name, description,created_date, last_modified_date, created_by, last_modified_by) values(2,'WRITE_CUSTOMER','Permission to write customer data',  now(), now(), 1, 1)/;
insert into permission(id, name, description,created_date, last_modified_date, created_by, last_modified_by) values(3,'UPDATE_CUSTOMER','Permission to update customer data',  now(), now(), 1, 1)/;

insert into role(id, name, description, created_date, last_modified_date, created_by, last_modified_by) values(1,'Admin','Admin Role', now(), now(), 1, 1)/;

insert into role_permission(id, role_id, permission_id, created_date, last_modified_date, created_by, last_modified_by) values(1,1,1,now(), now(), 1, 1)/;
insert into role_permission(id, role_id, permission_id, created_date, last_modified_date, created_by, last_modified_by) values(2,1,2,now(), now(), 1, 1)/;
insert into role_permission(id, role_id, permission_id, created_date, last_modified_date, created_by, last_modified_by) values(3,1,3,now(), now(), 1, 1)/;

insert into user(id, user_name, password, preference, created_date, last_modified_date, created_by, last_modified_by, staff_id) values(1,'zhouqi','zhou215',NULL, now(), now(), 1, 1, 1)/;
insert into user(id, user_name, password, preference, created_date, last_modified_date, created_by, last_modified_by, staff_id) values(2,'lv1','123456',NULL, now(), now(), 1, 1, 2)/;
insert into user(id, user_name, password, preference, created_date, last_modified_date, created_by, last_modified_by, staff_id) values(3,'lv21','123456',NULL, now(), now(), 1, 1, 3)/;
insert into user(id, user_name, password, preference, created_date, last_modified_date, created_by, last_modified_by, staff_id) values(4,'lv22','123456',NULL, now(), now(), 1, 1, 4)/;
insert into user(id, user_name, password, preference, created_date, last_modified_date, created_by, last_modified_by, staff_id) values(5,'lv31','123456',NULL, now(), now(), 1, 1, 5)/;
insert into user(id, user_name, password, preference, created_date, last_modified_date, created_by, last_modified_by, staff_id) values(6,'lv41','123456',NULL, now(), now(), 1, 1, 6)/;
insert into user(id, user_name, password, preference, created_date, last_modified_date, created_by, last_modified_by, staff_id) values(7,'lv42','123456',NULL, now(), now(), 1, 1, 7)/;
insert into user(id, user_name, password, preference, created_date, last_modified_date, created_by, last_modified_by, staff_id) values(8,'lv51','123456',NULL, now(), now(), 1, 1, 8)/;

insert into user_role(id, user_id, role_id, created_date, last_modified_date, created_by, last_modified_by) values (1,1,1, now(), now(), 1, 1)/;

insert into staff_district(id, staff_id, district_id, created_date, last_modified_date, created_by, last_modified_by) values(1, 1, 1, now(), now(), 1, 1)/; 
insert into staff_district(id, staff_id, district_id, created_date, last_modified_date, created_by, last_modified_by) values(2, 1, 2, now(), now(), 1, 1)/; 
insert into staff_district(id, staff_id, district_id, created_date, last_modified_date, created_by, last_modified_by) values(3, 2, 1, now(), now(), 1, 1)/; 
insert into staff_district(id, staff_id, district_id, created_date, last_modified_date, created_by, last_modified_by) values(4, 2, 2, now(), now(), 1, 1)/; 
insert into staff_district(id, staff_id, district_id, created_date, last_modified_date, created_by, last_modified_by) values(5, 3, 1, now(), now(), 1, 1)/; 
insert into staff_district(id, staff_id, district_id, created_date, last_modified_date, created_by, last_modified_by) values(6, 4, 2, now(), now(), 1, 1)/; 
insert into staff_district(id, staff_id, district_id, created_date, last_modified_date, created_by, last_modified_by) values(7, 5, 1, now(), now(), 1, 1)/; 
insert into staff_district(id, staff_id, district_id, created_date, last_modified_date, created_by, last_modified_by) values(8, 5, 2, now(), now(), 1, 1)/; 
