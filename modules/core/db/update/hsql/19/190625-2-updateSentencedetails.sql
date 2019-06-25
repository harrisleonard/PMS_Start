alter table PMSSTART_SENTENCEDETAILS add column SENTENCELENGHTH varchar(50) ^
update PMSSTART_SENTENCEDETAILS set SENTENCELENGHTH = 'sentenceunder2years' where SENTENCELENGHTH is null ;
alter table PMSSTART_SENTENCEDETAILS alter column SENTENCELENGHTH set not null ;
alter table PMSSTART_SENTENCEDETAILS add column OFFENCETYPE varchar(50) ^
update PMSSTART_SENTENCEDETAILS set OFFENCETYPE = 'bankingandinsurancecounterfeitEmbezzlement' where OFFENCETYPE is null ;
alter table PMSSTART_SENTENCEDETAILS alter column OFFENCETYPE set not null ;
alter table PMSSTART_SENTENCEDETAILS add column REMARKS longvarchar ;
alter table PMSSTART_SENTENCEDETAILS add column PRISONERDETAILS_ID varchar(36) ;
