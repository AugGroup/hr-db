--MASDIVISION
INSERT INTO MAS_DIVISION (NAME,CODE,ISACTIVE,AUDITFLAG,CREATEDTIMESTAMP,CREATEDBY) VALUES ('CEO Office of CEO','01',0,'C',NOW(),0);
INSERT INTO MAS_DIVISION (NAME,CODE,ISACTIVE,AUDITFLAG,CREATEDTIMESTAMP,CREATEDBY) VALUES ('F&A Finance & Administration','02',0,'C',NOW(),0);
INSERT INTO MAS_DIVISION (NAME,CODE,ISACTIVE,AUDITFLAG,CREATEDTIMESTAMP,CREATEDBY) VALUES ('MKT Marketing','04',0,'C',NOW(),0);
INSERT INTO MAS_DIVISION (NAME,CODE,ISACTIVE,AUDITFLAG,CREATEDTIMESTAMP,CREATEDBY) VALUES ('MoH Ministry of Happiness','05',0,'C',NOW(),0);
INSERT INTO MAS_DIVISION (NAME,CODE,ISACTIVE,AUDITFLAG,CREATEDTIMESTAMP,CREATEDBY) VALUES ('SAP SAP Services','06',0,'C',NOW(),0);
INSERT INTO MAS_DIVISION (NAME,CODE,ISACTIVE,AUDITFLAG,CREATEDTIMESTAMP,CREATEDBY) VALUES ('TXM Transformation','07',0,'C',NOW(),0);


--MASTECHNOLOGY
INSERT INTO MAS_TECHNOLOGY (ID,NAME,auditFlag,createdTimeStamp,createdBy,ISACTIVE,CODE) VALUES (1,'.Net','C',NOW(),0,true,1);
INSERT INTO MAS_TECHNOLOGY (ID,NAME,auditFlag,createdTimeStamp,createdBy,ISACTIVE,CODE) VALUES (2,'COBOL','C',NOW(),0,true,1);
INSERT INTO MAS_TECHNOLOGY (ID,NAME,auditFlag,createdTimeStamp,createdBy,ISACTIVE,CODE) VALUES (3,'Java','C',NOW(),0,true,1);
INSERT INTO MAS_TECHNOLOGY (ID,NAME,auditFlag,createdTimeStamp,createdBy,ISACTIVE,CODE) VALUES (4,'PHP','C',NOW(),0,true,1);
INSERT INTO MAS_TECHNOLOGY (ID,NAME,auditFlag,createdTimeStamp,createdBy,ISACTIVE,CODE) VALUES (5,'SAP','C',NOW(),0,true,1);


--MASSPECIALTY
insert into MAS_SPECIALTY (name,code,isactive,auditFlag,createdTimeStamp,createdBy)
VALUES 
('ABAP','01',1,'C',NOW(),0),
('ASP.Net','02',1,'C',NOW(),0),
('Basis','03',1,'C',NOW(),0),
('BI','04',1,'C',NOW(),0),
('BPC - B','05',1,'C',NOW(),0),
('BPC - C','06',1,'C',NOW(),0),
('BW','07',1,'C',NOW(),0),
('C#','08',1,'C',NOW(),0),
('C++.Netframework','09',1,'C',NOW(),0),
('CO','10',1,'C',NOW(),0),
('CRM','11',1,'C',NOW(),0),
('CSS','12',1,'C',NOW(),0),
('Eclipse','13',1,'C',NOW(),0),
('FI','14',1,'C',NOW(),0),
('Hibernate','15',1,'C',NOW(),0),
('HTML','16',1,'C',NOW(),0),
('J2EE','17',1,'C',NOW(),0),
('Java Script','18',1,'C',NOW(),0),
('JBOSS','19',1,'C',NOW(),0),
('JQUERY SVN Respsoitry','20',1,'C',NOW(),0),
('JSF','21',1,'C',NOW(),0),
('MM','22',1,'C',NOW(),0),
('Mobility','23',1,'C',NOW(),0),
('MVC','24',1,'C',NOW(),0),
('Oracle','25',1,'C',NOW(),0),
('Oracle10g','26',1,'C',NOW(),0),
('Oracle9i','27',1,'C',NOW(),0),
('PI','28',1,'C',NOW(),0),
('PL/SQL','29',1,'C',NOW(),0),
('PM','30',1,'C',NOW(),0),
('PP','31',1,'C',NOW(),0),
('SD','32',1,'C',NOW(),0),
('Security','33',1,'C',NOW(),0),
('Spring','34',1,'C',NOW(),0),
('SRM','35',1,'C',NOW(),0),
('Symfony1,2','36',1,'C',NOW(),0),
('TR','37',1,'C',NOW(),0),
('VB.Net','38',1,'C',NOW(),0),
('Web App','39',1,'C',NOW(),0),
('Web Logic','40',1,'C',NOW(),0),
('WPF','41',1,'C',NOW(),0),
('Zend','42',1,'C',NOW(),0);




--MASJOBLEVEL
insert into MAS_JOBLEVEL(name,code,isactive,auditFlag,createdTimeStamp,createdBy) 
values('Account Execute','AE',1,'C',NOW(),0),
('Account Manager','AM',1,'C',NOW(),0),
('Business Division Director','BDD',1,'C',NOW(),0),
('Consultant','C',1,'C',NOW(),0),
('Manager','M',1,'C',NOW(),0),
('Managing Consultant','MC',1,'C',NOW(),0),
('Partner','P',1,'C',NOW(),0),
('Principal Consultant','PC',1,'C',NOW(),0),
('Professional','PF',1,'C',NOW(),0),
('Senior Account Manager','SAM',1,'C',NOW(),0),
('Senior Consultant','SC',1,'C',NOW(),0),
('Senior Manager','SM',1,'C',NOW(),0),
('Senior Professional','SP',1,'C',NOW(),0),
('Support Division Director','SDD',1,'C',NOW(),0);





--MASADDRESSTYPE
INSERT INTO MAS_ADDRESSTYPE(ADDRESSTYPENAME,CODE,ISACTIVE,auditFlag,createdTimeStamp,createdBy) VALUES ('Present address','P01',1,'C',NOW(),0),('Permanent address','M02',1,'C',NOW(),0),
('Permanent address','M02',1,'C',NOW(),0);


--MASDEGREETYPE
insert into MAS_DEGREETYPE (name,code,isactive,auditFlag,createdTimeStamp,createdBy)
VALUES
('Bachelor','a',1,'C',NOW(),0),
('Masters','a',1,'C',NOW(),0),
('Ph.D.','a',1,'C',NOW(),0);


--MASEMPLOYMENT
INSERT INTO MAS_EMPLOYMENT(NAME,CODE,ISACTIVE,auditFlag,createdTimeStamp,createdBy) VALUES ('Permanent','A01',1,'C',NOW(),0);
INSERT INTO MAS_EMPLOYMENT(NAME,CODE,ISACTIVE,auditFlag,createdTimeStamp,createdBy) VALUES ('Contract','A01',1,'C',NOW(),0);





--MASPROVINCE
insert into MAS_PROVINCE (PROVINCENAME,CODE,ISACTIVE,auditFlag,createdTimeStamp,createdBy)
VALUES
('Bangkok','a',1,'C',NOW(),0),
('Chiang Rai','a',1,'C',NOW(),0),
('Chiang Mai','a',1,'C',NOW(),0),
('Nan','a',1,'C',NOW(),0),
('Phayao','a',1,'C',NOW(),0),
('Phrae','a',1,'C',NOW(),0),
('Mae Hong Son','a',1,'C',NOW(),0),
('Lampang','a',1,'C',NOW(),0),
('Lamphun','a',1,'C',NOW(),0),
('Uttaradit','a',1,'C',NOW(),0),
('Kalasin','a',1,'C',NOW(),0),
('Khon Kaen','a',1,'C',NOW(),0),
('Chaiyaphum','a',1,'C',NOW(),0),
('Nakhon Phanom','a',1,'C',NOW(),0),
('Nakhon Ratchasima','a',1,'C',NOW(),0),
('Bueng Kan','a',1,'C',NOW(),0),
('Buri Ram','a',1,'C',NOW(),0),
('Maha Sarakham','a',1,'C',NOW(),0),
('Mukdahan','a',1,'C',NOW(),0),
('Yasothon','a',1,'C',NOW(),0),
('Roi Et','a',1,'C',NOW(),0),
('Loei','a',1,'C',NOW(),0),
('Si Sa Ket','a',1,'C',NOW(),0),
('Sakon Nakhon','a',1,'C',NOW(),0),
('Surin','a',1,'C',NOW(),0),
('Nong Khai','a',1,'C',NOW(),0),
('Nong Bua Lam Phu','a',1,'C',NOW(),0),
('Amnat Charoen','a',1,'C',NOW(),0),
('Udon Thani','a',1,'C',NOW(),0),
('Ubon Ratchathani','a',1,'C',NOW(),0),
('Kamphaeng Phet','a',1,'C',NOW(),0),
('Chai Nat','a',1,'C',NOW(),0),
('Nakhon Nayok','a',1,'C',NOW(),0),
('Nakhon Pathom','a',1,'C',NOW(),0),
('Nakhon Sawan','a',1,'C',NOW(),0),
('Nonthaburi','a',1,'C',NOW(),0),
('Pathum Thani','a',1,'C',NOW(),0),
('Phra Nakhon Si Ayutthaya','a',1,'C',NOW(),0),
('Phichit','a',1,'C',NOW(),0),
('Phitsanulok','a',1,'C',NOW(),0),
('Phetchabun','a',1,'C',NOW(),0),
('Lop Buri','a',1,'C',NOW(),0),
('Samut Prakan','a',1,'C',NOW(),0),
('Samut Songkhram','a',1,'C',NOW(),0),
('Samut Sakhon','a',1,'C',NOW(),0),
('Sing Buri','a',1,'C',NOW(),0),
('Sukhothai','a',1,'C',NOW(),0),
('Suphan Buri','a',1,'C',NOW(),0),
('Saraburi','a',1,'C',NOW(),0),
('Ang Thong','a',1,'C',NOW(),0),
('Uthai Thani','a',1,'C',NOW(),0),
('Chanthaburi','a',1,'C',NOW(),0),
('Chachoengsao','a',1,'C',NOW(),0),
('Chon Buri','a',1,'C',NOW(),0),
('Trat','a',1,'C',NOW(),0),
('Prachin Buri','a',1,'C',NOW(),0),
('Rayong','a',1,'C',NOW(),0),
('Sa Kaeo','a',1,'C',NOW(),0),
('Kanchanaburi','a',1,'C',NOW(),0),
('Tak','a',1,'C',NOW(),0),
('Prachuap Khiri Khan','a',1,'C',NOW(),0),
('Phetchaburi','a',1,'C',NOW(),0),
('Ratchaburi','a',1,'C',NOW(),0),
('Krabi','a',1,'C',NOW(),0),
('Chumphon','a',1,'C',NOW(),0),
('Trang','a',1,'C',NOW(),0),
('Nakhon Si Thammarat','a',1,'C',NOW(),0),
('Narathiwat','a',1,'C',NOW(),0),
('Pattani','a',1,'C',NOW(),0),
('Phangnga','a',1,'C',NOW(),0),
('Phatthalung','a',1,'C',NOW(),0),
('Phuket','a',1,'C',NOW(),0),
('Yala','a',1,'C',NOW(),0),
('Ranong','a',1,'C',NOW(),0),
('Songkhla','a',1,'C',NOW(),0),
('Satun','a',1,'C',NOW(),0),
('Surat Thani','a',1,'C',NOW(),0);



--MasCoreSkill
INSERT INTO MAS_CORESKILL (NAME,CODE,ISACTIVE,auditFlag,createdTimeStamp,createdBy) VALUES 
('Administration','AD',b'1','C',NOW(),0),
('Application Analyst','AA',b'1','C',NOW(),0),
('Business Analyst','BA',b'1','C',NOW(),0),
('Business Development','BD',b'1','C',NOW(),0),
('Data Base Administrator','DBA',b'1','C',NOW(),0),
('Finance','FI',b'1','C',NOW(),0),
('Happiness','HP',b'1','C',NOW(),0),
('ITS','ITS',b'1','C',NOW(),0),
('Marketing','MK',b'1','C',NOW(),0),
('Ministry of Happiness','MHP',b'1','C',NOW(),0),
('Programmer','PG',b'1','C',NOW(),0),
('Project Coordinator','PC',b'1','C',NOW(),0),
('Project Manager','PM',b'1','C',NOW(),0),
('Recruitment','RC',b'1','C',NOW(),0),
('SAP','SAP',b'1','C',NOW(),0),
('Software Tester','ST',b'1','C',NOW(),0),
('Solution Architect','SR',b'1','C',NOW(),0),
('System Analyst','SA',b'1','C',NOW(),0),
('Transformation','TR',b'1','C',NOW(),0);



--MASLOCATION
INSERT INTO MAS_LOCATION(NAME,CODE,ISACTIVE,auditFlag,createdTimeStamp,createdBy) VALUES ('Thailand','TH',1,'C',NOW(),0),
 ('Singapore','SG',1,'C',NOW(),0),
 ('Indonesia','ID',1,'C',NOW(),0),
 ('Australia','AU',1,'C',NOW(),0);
 
 
 
 --MASSTAFFTYPE
INSERT INTO MAS_STAFFTYPE(
 AUDITFLAG,
 CREATEDBY,
 CREATEDTIMESTAMP,
 CODE,
 ISACTIVE,
 STAFFTYPENAME)
values
('C',0,NOW(),'01A',true,'Billable'), 
('C',0,NOW(),'02A',true,'Back office');


--MASRELATIONTYPE
INSERT INTO MAS_RELATIONTYPE(
 AUDITFLAG,
 CODE,
 CREATEDBY,
 CREATEDTIMESTAMP,
 ISACTIVE,
 RELATIONTYPE
) values
('C','01',0,NOW(),true,'SON'),
('C','2',0,NOW(),true,'DAUGTHER');



--MASLEAVETYPE
INSERT INTO MAS_LEAVETYPE (NAME,CODE,ISACTIVE,auditFlag,createdTimeStamp,createdBy) VALUES
('Annual Holiday Leave','L01',true,'C',NOW(),0),
('Maternity Leave','L02',true,'C',NOW(),0),
('Personal Leave','L03',true,'C',NOW(),0),
('Sick Leave','L04',true,'C',NOW(),0),
('Urgent Leave','L05',true,'C',NOW(),0),
('Other','L06',true,'C',NOW(),0);


--MASROLE
INSERT INTO MAS_ROLE(TYPE, AUDITFLAG,CREATEDBY,CREATEDTIMESTAMP,ISACTIVE) VALUES
 ('ROLE_ADMIN','C',0,NOW(),1),
 ('ROLE_STAFF','C',0,NOW(),1),
 ('ROLE_HR','C',0,NOW(),1);
 
 
 --MASALLOWANCES
INSERT INTO MAS_ALLOWANCES (ALLOWANCES_TYPE,AMOUNT_ALLOWANCES,CODE,ISACTIVE,auditFlag,createdTimeStamp,createdBy) VALUES 
('ลดหย่อนส่วนบุคคล-ผู้มีเงินได้',30000,'A1',1,'C',NOW(),0),
('ลดหย่อนส่วนบุคคล-คู่สมรส ที่ไม่มีเงินได้',30000,'A2',1,'C',NOW(),0),
('ลดหย่อนส่วนบุคคล-บุตรที่ศึกษาในประเทศ',17000,'A3',1,'C',NOW(),0),
('ลดหย่อนส่วนบุคคล-บุตรที่ไม่ได้ศึกษาหรือศึกษาในต่างประเทศ',15000,'A4',1,'C',NOW(),0),
('ลดหย่อนส่วนบุคคล-ค่าอุปการะเลี้ยงดูบิดา มารดาของผู้มีเงินได้',30000,'A5',1,'C',NOW(),0),
('ลดหย่อนส่วนบุคคล-ค่าอุปการะเลี้ยงดูคนพิการหรือคนทุพพลภาพ',60000,'A6',1,'C',NOW(),0),
('ลดหย่อนและยกเว้น สำหรับเบี้ยประกันชีวิต-ผู้มีเงินได้',100000,'A7',1,'C',NOW(),0),
('ลดหย่อนและยกเว้น สำหรับเบี้ยประกันชีวิต-คู่สมรสที่ไม่มีเงินได้',10000,'A8',1,'C',NOW(),0),
('ยกเว้นเบี้ยประกันสุขภาพ บิดา มารดา ของผู้มีเงินได้ และบิดา มารดาของคู่สมรส ที่ไม่มีเงินได้',15000,'A9',1,'C',NOW(),0),
('ลดหย่อนและยกเว้นเงินสะสมที่จ่ายเข้ากองทุนสำรองเลี้ยงชีพ',500000,'A10',1,'C',NOW(),0),
('ยกเว้นค่าซื้อหน่วยลงทุนในกองทุนรวมเพื่อการเลี้ยงชีพ RMF',500000,'A11',1,'C',NOW(),0),
('ยกเว้นค่าซื้อหน่วยลงทุนในกองทุนรวมหุ้นระยะยาว  LTF',500000,'A12',1,'C',NOW(),0),
('ยกเว้นเงินสะสม กบข.',500000,'A13',1,'C',NOW(),0),
('ยกเว้นเงินสะสมกองทุนสงเคราะห์ครูโรงเรียนเอกชน',500000,'A14',1,'C',NOW(),0),
('ยกเว้นเงินค่าชดเชยที่ได้รับตามกฎหมายว่าด้วยการคุ้มครองแรงงาน',300000,'A15',1,'C',NOW(),0),
('ลดหย่อนและยกเว้น สำหรับดอกเบี้ยเงินกู้ยืมเพื่อการมีที่อยู่อาศัย-ผู้มีเงินได้กู้ยืมคนเดียว',100000,'A16',1,'C',NOW(),0),
('ลดหย่อนและยกเว้น สำหรับดอกเบี้ยเงินกู้ยืมเพื่อการมีที่อยู่อาศัย-ผู้มีเงินได้หลายคนร่วมกันกู้ยืม',100000,'A17',1,'C',NOW(),0),
('ลดหย่อนเงินสมทบที่จ่ายเข้ากองทุนประกันสังคม',9000,'A18',1,'C',NOW(),0),
('ลดหย่อนและยกเว้นเงินบริจาค-ยกเว้นค่าใช้จ่ายเพื่อสนับสนุนการศึกษา',null,'A19',1,'C',NOW(),0),
('ลดหย่อนและยกเว้นเงินบริจาค-ยกเว้นค่าใช้จ่ายและเงินบริจาค',null,'A22',1,'C',NOW(),0),
('ลดหย่อนและยกเว้นเงินบริจาค-ลดหย่อนเงินบริจาคทั่วไป',null,'A23',1,'C',NOW(),0),
('ลดหย่อนและยกเว้นเงินบริจาค-ลดหย่อนเงินบริจาคเพื่อช่วยเหลือผู้ประสบอุทกภัย',null,'A24',1,'C',NOW(),0),
('ยกเว้นเงินได้ที่ผู้มีเงินได้ซึ่งเป็นผู้อยู่ในไทย และมีอายุ ไม่ต่ำกว่า 65 ปี บริบูรณ์',190000,'A25',1,'C',NOW(),0),
('ยกเว้นเงินได้ที่ผู้มีเงินได้ซึ่งเป็นคนพิการอยู่ในไทย และมีอายุไม่เกิน 65 ปี บริบูรณ์',190000,'A26',1,'C',NOW(),0),
('ยกเว้นเงินได้จากการซื้ออสังหาริมทรัพย์ฯ',5000000,'A27',1,'C',NOW(),0),
('ยกเว้นเงินได้ที่ได้จ่ายเป็นค่าซ่อมแซมบ้านที่ได้รับผลกระทบจากอุทกภัยที่เกิดขึ้นในระหว่างวันที่ 25 ก.ค. 2554  – 31 ธ.ค. 2554',100000,'A28',1,'C',NOW(),0),
('ยกเว้นเงินได้ที่ได้จ่ายเป็นค่าซ่อมแซมรถยนต์ที่ได้รับผลกระทบจากอุทกภัยที่เกิดขึ้นในระหว่างวันที่ 25 ก.ค. 2554 – 31 ธ.ค. 2554',30000,'A29',1,'C',NOW(),0);

 INSERT INTO EXPERIENCE (ID,AUDITFLAG,CREATEDBY,CREATEDTIMESTAMP,ADDRESS,TYPE_OF_BUSINESS,DATE_FROM, DATE_TO, POSITION, REASON, REFERENCE, RESPONSIBILITY, SALARY)
 VALUES('1','C',0,NOW(),'22/3 Bangkok','IT',STR_TO_DATE('01/04/2012','%d/%m/%Y'),STR_TO_DATE('01/08/2012','%d/%m/%Y'),'Consultance','-','John','-','30000'),
 ('2','C',0,NOW(),'22/4 Bangkok','IT',STR_TO_DATE('01/04/2012','%d/%m/%Y'),STR_TO_DATE('01/08/2012','%d/%m/%Y'),'Consultance','-','John','-','30000'),
 ('3','C',0,NOW(),'22/5 Bangkok','IT',STR_TO_DATE('01/04/2012','%d/%m/%Y'),STR_TO_DATE('01/08/2012','%d/%m/%Y'),'Consultance','-','John','-','30000'),
 ('4','C',0,NOW(),'22/6 Bangkok','IT',STR_TO_DATE('01/04/2012','%d/%m/%Y'),STR_TO_DATE('01/08/2012','%d/%m/%Y'),'Consultance','-','John','-','30000'),

INSERT INTO MAS_SKILLLANGUAGE (ID,AUDITFLAG,CODE,CREATEDBY,CREATEDTIMESTAMP,ISACTIVE,SKILL_LANGUAGE) 
VALUES 
(1,'C','0293',0,NOW(),true,'thai'),
(2,'C','0293',0,NOW(),true,'english');

 --EDUCATION
INSERT INTO EDUCATION(APPLICANT_ID, auditFlag, createdBy, createdTimeStamp, UNIVERSITY, DEGREETYPE_ID, MAJOR, FACULTY, GPA, START_DATE, GRADUATED_DATE, CERTIFICATION)
VALUES ('1','C',0,NOW(),'Thammasat University','1','Com','Science','3.0',STR_TO_DATE('26/01/1940','%d/%m/%Y'),STR_TO_DATE('26/01/1944','%d/%m/%Y'),'TOEIC 400'),
('2','C',0,NOW(),'Mahidol University','1','Com','Science','3.0',STR_TO_DATE('26/01/1940','%d/%m/%Y'),STR_TO_DATE('26/01/1944','%d/%m/%Y'),'TOEIC 400'),
('3','C',0,NOW(),'Kasetsart University','1','Marketing','BA','2.5',STR_TO_DATE('26/01/1940','%d/%m/%Y'),STR_TO_DATE('26/01/1944','%d/%m/%Y'),'TOEIC 400'),
('4','C',0,NOW(),'Bangkok University','2','Envi','Science','2.0',STR_TO_DATE('26/01/1940','%d/%m/%Y'),STR_TO_DATE('26/01/1944','%d/%m/%Y'),'TOEIC 400');
 