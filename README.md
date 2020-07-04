# demo-microservices
This is a basic demonstration of microservices. Two standalone SpringBoot applications, running on different ports communicate with each other, using RestTemplate.

## Description
**ForeignExchange** is the first of the two microservices. Its changes some hardcoded values of a particular currency (in this case IND) to some otherf hardcoded currencies 
(in this case EUR, USD and AUD). The conversion rates between INR and the other currencies are as well hardcoded.
The endpoint ````/currency-exchange/from/{from}/to/{to}``` exposes method ```ExchangeValue retrieveExchangeValue()```.

**input**: http://localhost:8000/currency-exchange/from/EUR/to/INR
**output**: {"id":10002,"from":"EUR","to":"INR","conversionMultiple":75.00,"port":8000}

**CurrencyConversionBean** is the second service. It consumes the above api specifying the 'to' and 'from' currencies together with the quantity of the 'from' currency to be exchanged.

**input**: http://localhost:8100/currency-converter/from/EUR/to/INR/quantity/300
**output**: {"id":10002,"from":"EUR","to":"INR","conversionMultiple":75.00,"quantity":300,"totalCalculatedAmount":22500.00,"port":8000}

## Credit
https://www.springboottutorial.com/

