DROP ALL OBJECTS
-- DROP TABLE IF EXISTS TEMP_TM_IMPAPP_HEADER;
-- CREATE TABLE TEMP_TM_IMPAPP_HEADER (
--    "BATCH_CODE" VARCHAR2(15),
--    "BATCH_DATE" DATE,
--    "APPLICATION_NO" VARCHAR2(20),
--    "POLICY_CLASS" VARCHAR2(20),
--    "SUM_INSURED" NUMBER(15,2),
--    "NET_PREMIUM" NUMBER(15,2),
--    "GROSS_PREMIUM" NUMBER(15,2),
--    "EFFECTIVE_DATE" DATE,
--    "EXPIRED_DATE" DATE,
--    "FLEET_FLAG" VARCHAR2(1),
--    "INSURED_TITLE_NAME" VARCHAR2(40),
--    "INSURED_TITLE_NAME_EN" VARCHAR2(40),
--    "INSURED_NAME" VARCHAR2(60),
--    "INSURED_NAME_EN" VARCHAR2(100),
--    "INSURED_LASTNAME" VARCHAR2(65),
--    "INSURED_LASTNAME_EN" VARCHAR2(100),
--    "MOOBARN" VARCHAR2(100),
--    "ROOM_NO" VARCHAR2(10),
--    "HOME_NO" VARCHAR2(10),
--    "MOO" VARCHAR2(3),
--    "SOI" VARCHAR2(100),
--    "ROAD" VARCHAR2(100),
--    "TUMBOL" VARCHAR2(100),
--    "AMPHUR" VARCHAR2(100),
--    "PROVINCE" VARCHAR2(100),
--    "POST_CODE" VARCHAR2(10),
--    "TEL_EXT" VARCHAR2(15),
--    "TEL" VARCHAR2(50),
--    "ACCOUNT_KEY_DWH" VARCHAR2(20),
--    "OCCUPATION" VARCHAR2(50),
--    "MODE_OF_PAYMENT" VARCHAR2(2),
--    "PAYMENT_CHANNEL" VARCHAR2(3),
--    "CREDIT_CARD_TYPE" VARCHAR2(3),
--    "CREDIT_CARD_NO" VARCHAR2(16),
--    "CARD_ISSUED_NAME" VARCHAR2(5),
--    "CARD_EXPIRY_DATE" VARCHAR2(5),
--    "CUSTOMER_TYPE" VARCHAR2(20),
--    "CARD_TYPE" VARCHAR2(20),
--    "CARD_NO" VARCHAR2(20),
--    "DETAIL_NO" NUMBER,
--    "STATUS" VARCHAR2(1),
--    "GENDER" VARCHAR2(1),
--    "MARRIAGE_STATUS" VARCHAR2(1),
--    "CUSTOMER_KEY_DWH" NUMBER(15,2),
--    "CHANNEL_FLAG" VARCHAR2(2),
--    "INSURER_CODE" VARCHAR2(10),
--    "POLICY_YEAR" VARCHAR2(10),
--    "BASE_CREDIT_CARD" VARCHAR2(16),
--    "SELLING_DATE" DATE,
--    "CAMPAIGN_CODE" VARCHAR2(10),
--    "INPUT_LINE" VARCHAR2(2000),
--    "FLAG_SUCCESS" VARCHAR2(1),
--    "VPD_ID" NUMBER,
--    "SEQ" NUMBER,
--    "PO_HSBC_FLAG" VARCHAR2(2) DEFAULT 'N',
--    "BAD_SEQ" NUMBER,
--    "POLICY_NO" VARCHAR2(30),
--    "SOURCE_OF_LEAD" VARCHAR2(3),
--    "INSURER_REF1" VARCHAR2(20),
--    "DOB" DATE
-- );