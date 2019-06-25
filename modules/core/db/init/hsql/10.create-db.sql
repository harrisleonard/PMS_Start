-- begin PMSSTART_PRISONERSRELEASE
create table PMSSTART_PRISONERSRELEASE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    REASONSFORRELEASE varchar(50) not null,
    RELEASEDATE timestamp not null,
    --
    primary key (ID)
)^
-- end PMSSTART_PRISONERSRELEASE
-- begin PMSSTART_VISITORSINFORMATION
create table PMSSTART_VISITORSINFORMATION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    RELATIONSHIPWITHINMATE varchar(50) not null,
    TELEPHONENUMBER varchar(255),
    ADDRESS varchar(255),
    --
    primary key (ID)
)^
-- end PMSSTART_VISITORSINFORMATION
-- begin PMSSTART_PRISONERDETAILS
create table PMSSTART_PRISONERDETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FULLNAME varchar(255) not null,
    GENDER varchar(50) not null,
    COUNTY varchar(50) not null,
    NATIONALITY varchar(50) not null,
    EMPLOYMENTTYPE varchar(50) not null,
    CONSTITUENCY varchar(50) not null,
    DATEOFBIRTH date not null,
    IDNUMBER_PASSPORTNUMBER varchar(255) not null,
    PHONENUMBER integer not null,
    --
    primary key (ID)
)^
-- end PMSSTART_PRISONERDETAILS
-- begin PMSSTART_NEXTOFKIN
create table PMSSTART_NEXTOFKIN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NEXTOFKINNAME varchar(255) not null,
    PHONENUMBER integer,
    RELATIONSHIP varchar(50) not null,
    PRISONERDETAILS_ID varchar(36),
    --
    primary key (ID)
)^
-- end PMSSTART_NEXTOFKIN
-- begin PMSSTART_PRISONERPROPERTY
create table PMSSTART_PRISONERPROPERTY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NATUREOFPROPERTY varchar(255) not null,
    SERIALNUMBER varchar(255),
    DESCRIPTION varchar(255),
    REMARKS varchar(255),
    --
    primary key (ID)
)^
-- end PMSSTART_PRISONERPROPERTY
-- begin PMSSTART_MEDICALINFORMATION
create table PMSSTART_MEDICALINFORMATION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    HEIGHT integer not null,
    WEIGHT integer not null,
    BLOODPRESSURE integer not null,
    TEMPERATURE integer not null,
    --
    primary key (ID)
)^
-- end PMSSTART_MEDICALINFORMATION
-- begin PMSSTART_CELLS
create table PMSSTART_CELLS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BLOCK varchar(50) not null,
    CELLNUMBER varchar(50) not null,
    --
    primary key (ID)
)^
-- end PMSSTART_CELLS
-- begin PMSSTART_FOREIGNADDRESS
create table PMSSTART_FOREIGNADDRESS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COUNTRY varchar(50) not null,
    TOWN varchar(50) not null,
    PRISONERDETAILS_ID varchar(36),
    --
    primary key (ID)
)^
-- end PMSSTART_FOREIGNADDRESS
-- begin PMSSTART_SENTENCEDETAILS
create table PMSSTART_SENTENCEDETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SENTENCELENGHTH varchar(50) not null,
    OFFENCETYPE varchar(50) not null,
    REMARKS longvarchar,
    PRISONERDETAILS_ID varchar(36),
    --
    primary key (ID)
)^
-- end PMSSTART_SENTENCEDETAILS
