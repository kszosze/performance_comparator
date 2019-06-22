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

After migrate code to OpenJDK JHM the Benchmark framework from Oracle.
Time unit as ser to MicroSeconds in order to have enough volume to compare.

# Run complete. Total time: 00:08:58

| Benchmark    | Mode  | Cnt    |  Score      | Error   | Units|
| testClassicFilter                     |avgt   |20     |0.161 |±    0.003  |us/op
| testClassicFilterBigList (80k elements)  |avgt   |20  |1775.122 |±  202.033  |us/op
| testClassicWithContainsFilter         |avgt   |20     |0.105 |±    0.010  |us/op
| testClassicWithContainsFilterBigList (80k elements) |avgt   |20  |1367.378 |±  769.988  |us/op
| testLambdaFilter                      |avgt   |20     |0.344 |±    0.096  |us/op
| testLambdaFilterBigList    (80k elements)           |avgt   |20  |4844.968 |± 1242.457  |us/op
| testLambdaWithSetFilter               |avgt   |20     |0.365 |±    0.090  |us/op
| testLambdaWithSetFilterBigList   (80k elements)     |avgt   |20  |2729.679 |± 1056.436  |us/op
| hashMapEnumFromString                                        | avgt   |20     |0.040 |±    0.009  |us/op
| streamEnumFromString                                          |avgt   |20     |0.240 |±    0.105  |us/op
| switchEnumFromString                                         | avgt   |20     |0.001 |±    0.001 | us/op
| mapFindElement                                  | avgt   |20     |0.005 |±    0.001  |us/op
| streamFindElement                               | avgt   |20     |0.640 |±    0.111  |us/op


Thanks!!
