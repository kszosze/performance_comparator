# Approaches Performance Comparator

During my short life as Developer, almost 13 years when I write that, I got into some nice discussions about
performance of some approaches chosen for some normal problems.
In this project I will try to collect the most controversial ones I found during my career, and put some measures.

For now I'll leave here 2 of the more funny ones:
* Enums
* On memory Repositories

Invite you to take a look at them and let your own performance test.
Rules are easy:
* No cheating ;)
* Keep the code easy, readable and understandable
* Be honorable

## Install and execution

Just execute maven dude!!

`mvn clean install`

## Results
This section, just add the execution times and if possible specs where you executed

_AMD A10-7850k - 3.70Ghz_
_16 Gb_
_Windows 10 Pro x64 bits_

| Test name | Time Microseconds |
|  ----: | :---: |
streamEnumFromString|22025
switchEnumFromString|1015
hashMapEnumFromString|1309
mapFindElement|206
streamFindElement|1481

| Test Name | Data size | Time Microseconds |

testLambdaWithSetFilter | 8 | 8736
testLambdaFilter | 8 | 620 
testClassicWithContainsFilter | 8 | 79 
testClassicFilter | 8 | 75 
testLambdaFilterBigList | 10000 | 2686 
testClassicFilterBigList | 10000 | 11814 
testLambdaWithSetFilterBigList | 10000 | 2487
testClassicWithContainsFilterBigList | 10000 | 2960 
testLambdaFilterBigList | 30000 | 7861 
testClassicFilterBigList | 30000 | 13405 
testLambdaWithSetFilterBigList | 30000 | 6632
testClassicWithContainsFilterBigList |30000 | 6744
testLambdaFilterBigList | 50000 | 24129
testClassicFilterBigList | 50000 | 28599
testLambdaWithSetFilterBigList | 50000 | 33727
testClassicWithContainsFilterBigList | 50000 |16198
testLambdaFilterBigList | 80000 | 20662
testClassicFilterBigList | 80000 | 42445
testLambdaWithSetFilterBigList | 80000 | 23450
testClassicWithContainsFilterBigList | 80000 | 37296

Update !!!
After migrate code to OpenJDK JHM the Benchmark framework from Oracle.
Time unit as ser to MicroSeconds in order to have enough volume to compare.

| # Run complete. Total time: 00:08:58

| Benchmark                                                                                | Mode  | Cnt    |  Score      | Error   |Units
| testClassicFilter                     avgt   20     0.161 ±    0.003  us/op
| testClassicFilterBigList              avgt   20  1775.122 ±  202.033  us/op
| testClassicWithContainsFilter         avgt   20     0.105 ±    0.010  us/op
| testClassicWithContainsFilterBigList  avgt   20  1367.378 ±  769.988  us/op
| testLambdaFilter                      avgt   20     0.344 ±    0.096  us/op
| testLambdaFilterBigList               avgt   20  4844.968 ± 1242.457  us/op
| testLambdaWithSetFilter               avgt   20     0.365 ±    0.090  us/op
| testLambdaWithSetFilterBigList        avgt   20  2729.679 ± 1056.436  us/op
| hashMapEnumFromString                                         avgt   20     0.040 ±    0.009  us/op
| streamEnumFromString                                          avgt   20     0.240 ±    0.105  us/op
| switchEnumFromString                                          avgt   20     0.001 ±    0.001  us/op
| mapFindElement                                   avgt   20     0.005 ±    0.001  us/op
| streamFindElement                                avgt   20     0.640 ±    0.111  us/op


Thanks!!