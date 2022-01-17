# Mobile_Gift


MySQL

### giftList

| no | primary key |
| --- | --- |
| vendor |  |
| gift_name |  |
| price |  |
| image_url |  |
| created_at |  |
| updated_at |  |

```sql
create table giftList(
		`no` int NOT NULL,
		`vendor` varchar(20) NOT NULL,
		`gift_name` varchar(50),
		`price` int NOT NULL,
		`image_url` varchar(100),
		`created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
		`updated_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
		PRIMARY KEY(no)
)
INSERT INTO `giftList` (`no`,`vendor`,`gift_name`,`price`,`image_url`,`created_at`,`updated_at`) VALUES (1,'StarBucks','아이스아메리카노 tall',4800,'http://gdimg.gmarket.co.kr/641073826/still/600?ver=1538621875','2022-01-18 00:43:44','2022-01-18 00:44:50');

```

/


API List

## [http://127.0.0.1:8080/admin/AllGiftList](http://127.0.0.1:8080/admin/AllGiftList) - GET


## [http://127.0.0.1:8080/admin/addGift](http://127.0.0.1:8080/admin/addGift) - POST
{
"vendor": "StarBucks",
"price": 5200,
"image_url": "[http://gdimg.gmarket.co.kr/1113469385/still/600?ver=1538627799](http://gdimg.gmarket.co.kr/1113469385/still/600?ver=1538627799)",
"gift_name": "돌체라떼 tall"
}
