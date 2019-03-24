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

Thanks!!