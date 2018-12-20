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

Thanks!!