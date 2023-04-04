---

excalidraw-plugin: parsed
tags: [excalidraw]

---
==⚠  Switch to EXCALIDRAW VIEW in the MORE OPTIONS menu of this document. ⚠==


# Text Elements
 ^P1BqHRJw

Main Thread ^o0Y3SC6a

Simple Coroutine  ^dDhTiwfx

Global(IO){
   launch{
     fakeApi()    
   }
} ^5r9N01bx

Main Thread ^iiADxgpL

Worker Thread ^moEFFoKL

fakeApi ^sOgE4IQl

Coroutine made in main thread 
in globalScope with launch which
 start in bg and do its work ^N979UdD8

 ^DvzY8kar

Main Thread ^SVt8uK7F

Coroutine withContext() ^B4kAIrW9

Global(IO){
   launch{
    val data = fakeApi()
    withContext(Main){
        text.set(data)
   }
} ^bjDSrDru

Main Thread ^CVUlQ83o

Worker Thread ^q03WORKN

fakeApi ^6vqyrnTp

Coroutine made in main thread 
in globalScope with launch which
 start in bg and do its work 
after geting result we switch 
the context to main and set the data ^31zQ8Tn6

data ^QQ5WLfqV

Coroutine is lightweight thread but not thread. Coroutine works concurently
means ^wG0ry1nn

This will be helpful when a thread is sitting idle 
and not doing anything, in that case, it can 
execute a few lines of another function. 
This way, it can take full advantage of the 
thread. Ultimately cooperation helps in multitasking. ^HqmEO8hD

Suspend Function:- A function that could be started, pause, and resume  ^E8wJ7pry

GlobalScope.launch(Dispatchers.Main) {
  doSomething() // non-suspend, UI thread
  doLongRunningTask() // suspend, Default background thread
  doSomethingElse() // non-suspend, UI thread
} ^VpPoH0uL

first dosomething() will run in UI thread because we run coroutine in UI thread then doLongRunningTask() will run in Default thread bcoz in Default then doSomethingElse() will run. ^sNlppmAq

   1. withContext() doesn't create new 
      coroutine it basically shift context. 
      also it is 
      suspend function.

   2. launch and async are not 
      suspend function ^QUdQcNm8

Coroutines are light-weight threads that allow you to write asynchronous non-blocking code. ^Sjsn8FsJ

Within a coroutine, the processing sequence may be suspended and resumed later. This allows for asynchronous, non-blocking code, without using callbacks or promises. That is asynchronous processing, but everything related to that coroutine can happen in a single thread. ^LRsIpJeu

Within a coroutine, the processing sequence may be suspended and resumed later. This allows for asynchronous, non-blocking code, without using callbacks or promises. That is asynchronous processing ^BBgNW1o2

All this happen in Single Thread ^ZGsWLYDg

Multiple  jobs ^uk3WsxzS

Coroutine Builder
 ^mSHtrgXS

1. launch()
2. async()
3. runBlocking() is regular fun ^mFrVsSGD

coroutineScope { }
this can only call from suspend fun or coroutine ^LDuXpT48

fun main() = runBlocking {
    doWorld()
    println("Done")
}

// Concurrently executes both sections
suspend fun doWorld() = coroutineScope { // this: CoroutineScope
    launch {
        delay(2000L)
        println("World 2")
    }
    launch {
        delay(1000L)
        println("World 1")
    }
    println("Hello")
} ^a0eUp6gT

Hello ^fZwfJ5DU

World 1 ^3Y2QjtU4

World 2 ^03vlqwlH

Done ^ap2pHoL2

Q How parent coroutine help in leak can be memory.
Ans:- if there are many coroutine present in parent coroutine and after certain point of time if any crash then parent coroutine cancel its all coroutine and help in memory leak. ^BA0ObsPO

Lightweight: You can run many coroutines 
on a single thread due to support for 
suspension, which doesn't block the thread where
the coroutine is running. Suspending saves 
memory over blocking while supporting many 
concurrent operations. ^EarycPCx

Fewer memory leaks: Use structured 
concurrency to run operations within a scope. ^6A5IIdZE

Out of memory if thread exceed 100K ^ZFAd3uAi


# Embedded files
5bd00d63be12b001510c24fef5a3d522eb4d8c43: [[Pasted Image 20230314005235_826.png]]
deaf001f0b9274dcf11b58742a7542ee0815354e: [[Pasted Image 20230314011805_714.png]]
c70996bee6098ce0090d63b4d334d40053e6df5e: [[Pasted Image 20230316005627_726.png]]
20093ffa25f0cdf367e6f0a35b83adcc558649c2: [[Pasted Image 20230316005728_797.png]]

%%
# Drawing
```json
{
	"type": "excalidraw",
	"version": 2,
	"source": "https://github.com/zsviczian/obsidian-excalidraw-plugin/releases/tag/1.8.19",
	"elements": [
		{
			"type": "text",
			"version": 364,
			"versionNonce": 1492033101,
			"isDeleted": false,
			"id": "P1BqHRJw",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 76.53515625,
			"y": -157.33984375,
			"strokeColor": "#407cb5",
			"backgroundColor": "transparent",
			"width": 10,
			"height": 24,
			"seed": 802550138,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513548,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "",
			"rawText": "",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": ""
		},
		{
			"type": "rectangle",
			"version": 471,
			"versionNonce": 1770715395,
			"isDeleted": false,
			"id": "CaAtUqNmu-BKhU9ysEXbf",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -151.458984375,
			"y": -186.490234375,
			"strokeColor": "#3782c8",
			"backgroundColor": "#fa5252",
			"width": 411,
			"height": 44,
			"seed": 468969274,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "o0Y3SC6a"
				}
			],
			"updated": 1678908513548,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 410,
			"versionNonce": 58674349,
			"isDeleted": false,
			"id": "o0Y3SC6a",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -10.412109375,
			"y": -176.490234375,
			"strokeColor": "#000000",
			"backgroundColor": "#fa5252",
			"width": 128.90625,
			"height": 24,
			"seed": 1395057894,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513548,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Main Thread",
			"rawText": "Main Thread",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "CaAtUqNmu-BKhU9ysEXbf",
			"originalText": "Main Thread"
		},
		{
			"type": "text",
			"version": 410,
			"versionNonce": 1886052515,
			"isDeleted": false,
			"id": "dDhTiwfx",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -51.25390625,
			"y": -236.628125,
			"strokeColor": "#000000",
			"backgroundColor": "#fa5252",
			"width": 232.7078857421875,
			"height": 33.6,
			"seed": 97695482,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513548,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 1,
			"text": "Simple Coroutine ",
			"rawText": "Simple Coroutine ",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Simple Coroutine "
		},
		{
			"type": "rectangle",
			"version": 839,
			"versionNonce": 1219178253,
			"isDeleted": false,
			"id": "vhcgH6kswrsIdaKytwftp",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -28.74609375,
			"y": -114.38671875,
			"strokeColor": "#000000",
			"backgroundColor": "#ced4da",
			"width": 172.70703125,
			"height": 120.5703125,
			"seed": 343990074,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1678908513548,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 556,
			"versionNonce": 1311560771,
			"isDeleted": false,
			"id": "5r9N01bx",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -4.9140625,
			"y": -97.86640625000001,
			"strokeColor": "#000000",
			"backgroundColor": "#ced4da",
			"width": 168.75,
			"height": 96,
			"seed": 921046842,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513548,
			"link": null,
			"locked": false,
			"fontSize": 16,
			"fontFamily": 3,
			"text": "Global(IO){\n   launch{\n     fakeApi()    \n   }\n}",
			"rawText": "Global(IO){\n   launch{\n     fakeApi()    \n   }\n}",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Global(IO){\n   launch{\n     fakeApi()    \n   }\n}"
		},
		{
			"type": "rectangle",
			"version": 526,
			"versionNonce": 384550253,
			"isDeleted": false,
			"id": "KJ1sH52VEsIZjf8ZEj_B2",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -140.5859375,
			"y": 35.76953125,
			"strokeColor": "#3782c8",
			"backgroundColor": "#fa5252",
			"width": 411,
			"height": 44,
			"seed": 1893250406,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "iiADxgpL"
				}
			],
			"updated": 1678908513548,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 464,
			"versionNonce": 1924092899,
			"isDeleted": false,
			"id": "iiADxgpL",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 0.4609375,
			"y": 45.76953125,
			"strokeColor": "#000000",
			"backgroundColor": "#fa5252",
			"width": 128.90625,
			"height": 24,
			"seed": 776223738,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513548,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Main Thread",
			"rawText": "Main Thread",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "KJ1sH52VEsIZjf8ZEj_B2",
			"originalText": "Main Thread"
		},
		{
			"type": "rectangle",
			"version": 1104,
			"versionNonce": 1368035277,
			"isDeleted": false,
			"id": "TPAtvw9BL0oOUNIndWHIX",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -134.93359375,
			"y": 121.05078125,
			"strokeColor": "#3782c8",
			"backgroundColor": "#228be6",
			"width": 274,
			"height": 40,
			"seed": 384075258,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "moEFFoKL"
				}
			],
			"updated": 1678908513548,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 1053,
			"versionNonce": 1308680067,
			"isDeleted": false,
			"id": "moEFFoKL",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -58.87109375,
			"y": 131.45078125,
			"strokeColor": "#000000",
			"backgroundColor": "#fa5252",
			"width": 121.875,
			"height": 19.2,
			"seed": 470445734,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513549,
			"link": null,
			"locked": false,
			"fontSize": 16,
			"fontFamily": 3,
			"text": "Worker Thread",
			"rawText": "Worker Thread",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "TPAtvw9BL0oOUNIndWHIX",
			"originalText": "Worker Thread"
		},
		{
			"type": "line",
			"version": 415,
			"versionNonce": 916524589,
			"isDeleted": false,
			"id": "MzsUXirQjxloUL1vg6-NE",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -104.63671875,
			"y": 80.11328125,
			"strokeColor": "#000000",
			"backgroundColor": "#228be6",
			"width": 0.3515625,
			"height": 39.0390625,
			"seed": 401769594,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1678908513549,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": null,
			"points": [
				[
					0,
					0
				],
				[
					-0.3515625,
					39.0390625
				]
			]
		},
		{
			"type": "ellipse",
			"version": 10382,
			"versionNonce": 1247803171,
			"isDeleted": false,
			"id": "FsmbQjDKcbPNmK0rmDujS",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -127.111328125,
			"y": 163.19296874999864,
			"strokeColor": "#000000",
			"backgroundColor": "#228be6",
			"width": 75,
			"height": 69,
			"seed": 1836722682,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [
				{
					"type": "text",
					"id": "sOgE4IQl"
				}
			],
			"updated": 1678908513549,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 643,
			"versionNonce": 85508237,
			"isDeleted": false,
			"id": "sOgE4IQl",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -108.37783241949553,
			"y": 178.59778479906277,
			"strokeColor": "#000000",
			"backgroundColor": "#228be6",
			"width": 37.5,
			"height": 38.4,
			"seed": 688760698,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513549,
			"link": null,
			"locked": false,
			"fontSize": 16,
			"fontFamily": 3,
			"text": "fake\nApi",
			"rawText": "fakeApi",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "FsmbQjDKcbPNmK0rmDujS",
			"originalText": "fakeApi"
		},
		{
			"type": "rectangle",
			"version": 641,
			"versionNonce": 104536771,
			"isDeleted": false,
			"id": "1IwV86CVW6UEDSJxGzSjx",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -212.4609375,
			"y": -250.96484375,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 529.17578125,
			"height": 513.83984375,
			"seed": 1509885306,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1678908513549,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 522,
			"versionNonce": 1655383789,
			"isDeleted": false,
			"id": "N979UdD8",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 3.5673076923077076,
			"y": 181.56694711538464,
			"strokeColor": "#5f3dc4",
			"backgroundColor": "transparent",
			"width": 246.5278778076172,
			"height": 57.599999999999994,
			"seed": 684993062,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513549,
			"link": "",
			"locked": false,
			"fontSize": 16,
			"fontFamily": 1,
			"text": "Coroutine made in main thread \nin globalScope with launch which\n start in bg and do its work",
			"rawText": "Coroutine made in main thread \nin globalScope with launch which\n start in bg and do its work",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Coroutine made in main thread \nin globalScope with launch which\n start in bg and do its work"
		},
		{
			"type": "text",
			"version": 622,
			"versionNonce": 1311820387,
			"isDeleted": false,
			"id": "DvzY8kar",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 630.381774421743,
			"y": -142.28415559621774,
			"strokeColor": "#407cb5",
			"backgroundColor": "transparent",
			"width": 8.729995727539062,
			"height": 20.4,
			"seed": 2035234534,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513549,
			"link": null,
			"locked": false,
			"fontSize": 17.464535846525504,
			"fontFamily": 1,
			"text": "",
			"rawText": "",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": ""
		},
		{
			"type": "rectangle",
			"version": 701,
			"versionNonce": 31572301,
			"isDeleted": false,
			"id": "Gu4CgKuyI54hIBhBv9rQN",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 457.5327983886448,
			"y": -149.20608384116792,
			"strokeColor": "#3782c8",
			"backgroundColor": "#fa5252",
			"width": 378,
			"height": 27,
			"seed": 1871745658,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "SVt8uK7F"
				}
			],
			"updated": 1678908513549,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 835,
			"versionNonce": 1460635139,
			"isDeleted": false,
			"id": "SVt8uK7F",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 606.6363140136448,
			"y": -142.9060838411679,
			"strokeColor": "#000000",
			"backgroundColor": "#fa5252",
			"width": 79.79296875,
			"height": 14.399999999999999,
			"seed": 2102618662,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513549,
			"link": null,
			"locked": false,
			"fontSize": 12.387241531044639,
			"fontFamily": 3,
			"text": "Main Thread",
			"rawText": "Main Thread",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "Gu4CgKuyI54hIBhBv9rQN",
			"originalText": "Main Thread"
		},
		{
			"type": "text",
			"version": 792,
			"versionNonce": 135663533,
			"isDeleted": false,
			"id": "B4kAIrW9",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 479.50778503048616,
			"y": -202.06768210121882,
			"strokeColor": "#000000",
			"backgroundColor": "#fa5252",
			"width": 283.4241943359375,
			"height": 28.799999999999997,
			"seed": 1133261626,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513549,
			"link": null,
			"locked": false,
			"fontSize": 24.450350185135708,
			"fontFamily": 1,
			"text": "Coroutine withContext()",
			"rawText": "Coroutine withContext()",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Coroutine withContext()"
		},
		{
			"type": "rectangle",
			"version": 1192,
			"versionNonce": 936758691,
			"isDeleted": false,
			"id": "doZdqBKZHjXwK1m9emLf_",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 469.34580369214234,
			"y": -108.17867978207819,
			"strokeColor": "#000000",
			"backgroundColor": "#ced4da",
			"width": 234.45693816063118,
			"height": 143.70319598415162,
			"seed": 820983142,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1678908513549,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 929,
			"versionNonce": 863080973,
			"isDeleted": false,
			"id": "bjDSrDru",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 494.66829064519936,
			"y": -93.65113778947557,
			"strokeColor": "#000000",
			"backgroundColor": "#ced4da",
			"width": 196.453125,
			"height": 109.2,
			"seed": 1836030118,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513549,
			"link": null,
			"locked": false,
			"fontSize": 13.971628677220401,
			"fontFamily": 3,
			"text": "Global(IO){\n   launch{\n    val data = fakeApi()\n    withContext(Main){\n        text.set(data)\n   }\n}",
			"rawText": "Global(IO){\n   launch{\n    val data = fakeApi()\n    withContext(Main){\n        text.set(data)\n   }\n}",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Global(IO){\n   launch{\n    val data = fakeApi()\n    withContext(Main){\n        text.set(data)\n   }\n}"
		},
		{
			"type": "rectangle",
			"version": 843,
			"versionNonce": 598876483,
			"isDeleted": false,
			"id": "lecHptK5m3IbVOc7jAeTJ",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 449.7651740031075,
			"y": 51.21136393434216,
			"strokeColor": "#3782c8",
			"backgroundColor": "#fa5252",
			"width": 359,
			"height": 39,
			"seed": 359673018,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "CVUlQ83o"
				},
				{
					"id": "yR92VAHUEEcoHvCvtTIYN",
					"type": "arrow"
				}
			],
			"updated": 1678908513549,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 1198,
			"versionNonce": 1089325165,
			"isDeleted": false,
			"id": "CVUlQ83o",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 573.1909552531075,
			"y": 60.51136393434216,
			"strokeColor": "#000000",
			"backgroundColor": "#fa5252",
			"width": 112.1484375,
			"height": 20.4,
			"seed": 1518441446,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513549,
			"link": null,
			"locked": false,
			"fontSize": 17.401307314019913,
			"fontFamily": 3,
			"text": "Main Thread",
			"rawText": "Main Thread",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "lecHptK5m3IbVOc7jAeTJ",
			"originalText": "Main Thread"
		},
		{
			"type": "rectangle",
			"version": 1395,
			"versionNonce": 1677918435,
			"isDeleted": false,
			"id": "Vftx6q09q6fDNNdNWqmHb",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 462.50991673069575,
			"y": 136.35275148276472,
			"strokeColor": "#3782c8",
			"backgroundColor": "#228be6",
			"width": 240,
			"height": 35,
			"seed": 922649978,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "q03WORKN"
				}
			],
			"updated": 1678908513549,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 1759,
			"versionNonce": 307507917,
			"isDeleted": false,
			"id": "q03WORKN",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 529.6085495431957,
			"y": 146.0527514827647,
			"strokeColor": "#000000",
			"backgroundColor": "#fa5252",
			"width": 105.802734375,
			"height": 15.6,
			"seed": 573712166,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513549,
			"link": null,
			"locked": false,
			"fontSize": 13.894796430145437,
			"fontFamily": 3,
			"text": "Worker Thread",
			"rawText": "Worker Thread",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "Vftx6q09q6fDNNdNWqmHb",
			"originalText": "Worker Thread"
		},
		{
			"type": "line",
			"version": 816,
			"versionNonce": 307686531,
			"isDeleted": false,
			"id": "bWTKTxqSGNZJ9L1hAL6PF",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": 495.70107665575614,
			"y": 89.98033757538232,
			"strokeColor": "#000000",
			"backgroundColor": "#228be6",
			"width": 16.60777504417723,
			"height": 43.75401782229997,
			"seed": 1675349222,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1678908513549,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": null,
			"points": [
				[
					0,
					0
				],
				[
					-16.60777504417723,
					43.75401782229997
				]
			]
		},
		{
			"type": "ellipse",
			"version": 10759,
			"versionNonce": 339628333,
			"isDeleted": false,
			"id": "cXFH-gj91CGsOO0UE061d",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 496.0364940646741,
			"y": 186.755633433732,
			"strokeColor": "#000000",
			"backgroundColor": "#228be6",
			"width": 66,
			"height": 61,
			"seed": 619598438,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [
				{
					"type": "text",
					"id": "6vqyrnTp"
				}
			],
			"updated": 1678908513549,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 1092,
			"versionNonce": 309093411,
			"isDeleted": false,
			"id": "6vqyrnTp",
			"fillStyle": "cross-hatch",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 513.510564035518,
			"y": 201.5888766075423,
			"strokeColor": "#000000",
			"backgroundColor": "#228be6",
			"width": 31.3828125,
			"height": 31.2,
			"seed": 631435002,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513549,
			"link": null,
			"locked": false,
			"fontSize": 13.395348837209298,
			"fontFamily": 3,
			"text": "fake\nApi",
			"rawText": "fakeApi",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "cXFH-gj91CGsOO0UE061d",
			"originalText": "fakeApi"
		},
		{
			"type": "rectangle",
			"version": 934,
			"versionNonce": 1679139725,
			"isDeleted": false,
			"id": "-bIQyqQ5PFzKHlfQivdS2",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 398.173828125,
			"y": -237.935546875,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 561.1795907516934,
			"height": 530.88671875,
			"seed": 807337914,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1678908513549,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 1953,
			"versionNonce": 1278339011,
			"isDeleted": false,
			"id": "31zQ8Tn6",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 5.742310965708098,
			"x": 717.0529457824356,
			"y": 170.0999272559483,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 352.2005615234375,
			"height": 107.99999999999999,
			"seed": 1515911290,
			"groupIds": [],
			"roundness": null,
			"boundElements": [
				{
					"id": "yR92VAHUEEcoHvCvtTIYN",
					"type": "arrow"
				}
			],
			"updated": 1678908513549,
			"link": "",
			"locked": false,
			"fontSize": 18.15875114144994,
			"fontFamily": 1,
			"text": "Coroutine made in main thread \nin globalScope with launch which\n start in bg and do its work \nafter geting result we switch \nthe context to main and set the data",
			"rawText": "Coroutine made in main thread \nin globalScope with launch which\n start in bg and do its work \nafter geting result we switch \nthe context to main and set the data",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Coroutine made in main thread \nin globalScope with launch which\n start in bg and do its work \nafter geting result we switch \nthe context to main and set the data"
		},
		{
			"type": "arrow",
			"version": 1041,
			"versionNonce": 281822737,
			"isDeleted": false,
			"id": "yR92VAHUEEcoHvCvtTIYN",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 673.7517777666346,
			"y": 224.9782184892702,
			"strokeColor": "#5f3dc4",
			"backgroundColor": "transparent",
			"width": 69.23245257911788,
			"height": 126.7318681522724,
			"seed": 1736903078,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1680586385787,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "WI5eMlBeEgBK8wyKU00D-",
				"gap": 9.964256717184458,
				"focus": 0.8394430927764452
			},
			"endBinding": {
				"elementId": "lecHptK5m3IbVOc7jAeTJ",
				"gap": 8.034986402655647,
				"focus": -0.639696735477316
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					61.35676413895865,
					-19.53427781431322
				],
				[
					69.23245257911788,
					-126.7318681522724
				]
			]
		},
		{
			"type": "diamond",
			"version": 6752,
			"versionNonce": 633730915,
			"isDeleted": false,
			"id": "WI5eMlBeEgBK8wyKU00D-",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 567.9125258844704,
			"y": 187.73176793618774,
			"strokeColor": "#5c940d",
			"backgroundColor": "transparent",
			"width": 99,
			"height": 60,
			"seed": 1777878202,
			"groupIds": [],
			"roundness": null,
			"boundElements": [
				{
					"type": "text",
					"id": "QQ5WLfqV"
				},
				{
					"id": "yR92VAHUEEcoHvCvtTIYN",
					"type": "arrow"
				}
			],
			"updated": 1678908513549,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 484,
			"versionNonce": 2067915853,
			"isDeleted": false,
			"id": "QQ5WLfqV",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 597.6625258844704,
			"y": 207.73176793618774,
			"strokeColor": "#5c940d",
			"backgroundColor": "transparent",
			"width": 39.48797607421875,
			"height": 19.2,
			"seed": 733391226,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513549,
			"link": null,
			"locked": false,
			"fontSize": 16,
			"fontFamily": 1,
			"text": "data",
			"rawText": "data",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": "WI5eMlBeEgBK8wyKU00D-",
			"originalText": "data"
		},
		{
			"type": "rectangle",
			"version": 86,
			"versionNonce": 1031213827,
			"isDeleted": false,
			"id": "CRrbAUzQyNOJE388oguxP",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -31.281268703806745,
			"y": -532.118051538117,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 806.2341725074059,
			"height": 128.7673957330112,
			"seed": 631569126,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 141,
			"versionNonce": 1199166125,
			"isDeleted": false,
			"id": "wG0ry1nn",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -8.954833649903819,
			"y": -517.3378891397427,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 746.7392578125,
			"height": 48,
			"seed": 2127645946,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "Coroutine is lightweight thread but not thread. Coroutine works concurently\nmeans",
			"rawText": "Coroutine is lightweight thread but not thread. Coroutine works concurently\nmeans",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Coroutine is lightweight thread but not thread. Coroutine works concurently\nmeans"
		},
		{
			"type": "image",
			"version": 240,
			"versionNonce": 1673771683,
			"isDeleted": false,
			"id": "PmosssLLRaqIqvq59-mSm",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": 863.3913778744111,
			"y": -811.3029551618076,
			"strokeColor": "transparent",
			"backgroundColor": "transparent",
			"width": 505.1351457596959,
			"height": 336.75676383979726,
			"seed": 2105471846,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false,
			"status": "pending",
			"fileId": "5bd00d63be12b001510c24fef5a3d522eb4d8c43",
			"scale": [
				1,
				1
			]
		},
		{
			"type": "rectangle",
			"version": 398,
			"versionNonce": 2003105037,
			"isDeleted": false,
			"id": "YGX8mAI0EGJlhXNxqS7Jq",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": 1030.9729078046175,
			"y": -439.78857732627114,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 528,
			"height": 189,
			"seed": 1699129786,
			"groupIds": [],
			"roundness": null,
			"boundElements": [
				{
					"type": "text",
					"id": "HqmEO8hD"
				}
			],
			"updated": 1678908513550,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 383,
			"versionNonce": 1431989827,
			"isDeleted": false,
			"id": "HqmEO8hD",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": 1039.9731519452425,
			"y": -405.28857732627114,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 509.99951171875,
			"height": 120,
			"seed": 51416378,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "This will be helpful when a thread is sitting idle \nand not doing anything, in that case, it can \nexecute a few lines of another function. \nThis way, it can take full advantage of the \nthread. Ultimately cooperation helps in multitasking.",
			"rawText": "This will be helpful when a thread is sitting idle \nand not doing anything, in that case, it can \nexecute a few lines of another function. \nThis way, it can take full advantage of the \nthread. Ultimately cooperation helps in multitasking.",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "YGX8mAI0EGJlhXNxqS7Jq",
			"originalText": "This will be helpful when a thread is sitting idle \nand not doing anything, in that case, it can \nexecute a few lines of another function. \nThis way, it can take full advantage of the \nthread. Ultimately cooperation helps in multitasking."
		},
		{
			"type": "image",
			"version": 131,
			"versionNonce": 377277293,
			"isDeleted": false,
			"id": "a4dDOIIiIBnBotAsaUiwc",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": 1168.824494234071,
			"y": -50.157378293936176,
			"strokeColor": "transparent",
			"backgroundColor": "transparent",
			"width": 467.22222120804577,
			"height": 311.48148080536384,
			"seed": 1750210278,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false,
			"status": "pending",
			"fileId": "deaf001f0b9274dcf11b58742a7542ee0815354e",
			"scale": [
				1,
				1
			]
		},
		{
			"type": "rectangle",
			"version": 96,
			"versionNonce": 890875363,
			"isDeleted": false,
			"id": "K8xtO0SzOVAoY-vqDIaJQ",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": 1293.7008573785292,
			"y": 322.1936555032577,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 310,
			"height": 100,
			"seed": 232318074,
			"groupIds": [],
			"roundness": null,
			"boundElements": [
				{
					"type": "text",
					"id": "E8wJ7pry"
				}
			],
			"updated": 1678908513550,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 143,
			"versionNonce": 84596173,
			"isDeleted": false,
			"id": "E8wJ7pry",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": 1300.2209837213027,
			"y": 336.1936555032577,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 296.9597473144531,
			"height": 72,
			"seed": 1059052986,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "Suspend Function:- A function \nthat could be started, \npause, and resume ",
			"rawText": "Suspend Function:- A function that could be started, pause, and resume ",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "K8xtO0SzOVAoY-vqDIaJQ",
			"originalText": "Suspend Function:- A function that could be started, pause, and resume "
		},
		{
			"type": "rectangle",
			"version": 595,
			"versionNonce": 1175452035,
			"isDeleted": false,
			"id": "dowF8qX8mV0sZzKgZUeuN",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": 174.26326773180313,
			"y": 727.2790571654522,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 528,
			"height": 189,
			"seed": 1278436090,
			"groupIds": [],
			"roundness": null,
			"boundElements": [
				{
					"type": "text",
					"id": "sNlppmAq"
				}
			],
			"updated": 1678908513550,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 826,
			"versionNonce": 1579717677,
			"isDeleted": false,
			"id": "sNlppmAq",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": 179.26326773180313,
			"y": 773.7790571654522,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 514.3195190429688,
			"height": 96,
			"seed": 1298391462,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "first dosomething() will run in UI thread because we\nrun coroutine in UI thread then \ndoLongRunningTask() will run in Default thread bcoz\nin Default then doSomethingElse() will run.",
			"rawText": "first dosomething() will run in UI thread because we run coroutine in UI thread then doLongRunningTask() will run in Default thread bcoz in Default then doSomethingElse() will run.",
			"textAlign": "left",
			"verticalAlign": "middle",
			"containerId": "dowF8qX8mV0sZzKgZUeuN",
			"originalText": "first dosomething() will run in UI thread because we run coroutine in UI thread then doLongRunningTask() will run in Default thread bcoz in Default then doSomethingElse() will run."
		},
		{
			"type": "rectangle",
			"version": 534,
			"versionNonce": 1702613283,
			"isDeleted": false,
			"id": "QYFl4-Nhk9GIWfQKKoavi",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "dashed",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -91.4185780174862,
			"y": 570.0486305924779,
			"strokeColor": "#000000",
			"backgroundColor": "#be4bdb",
			"width": 725,
			"height": 183,
			"seed": 129370170,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "VpPoH0uL"
				}
			],
			"updated": 1678908513550,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 543,
			"versionNonce": 499091085,
			"isDeleted": false,
			"id": "VpPoH0uL",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -86.4185780174862,
			"y": 601.5486305924779,
			"strokeColor": "#000",
			"backgroundColor": "transparent",
			"width": 691.40625,
			"height": 120,
			"seed": 691314746,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "GlobalScope.launch(Dispatchers.Main) {\n  doSomething() // non-suspend, UI thread\n  doLongRunningTask() // suspend, Default background thread\n  doSomethingElse() // non-suspend, UI thread\n}",
			"rawText": "GlobalScope.launch(Dispatchers.Main) {\n  doSomething() // non-suspend, UI thread\n  doLongRunningTask() // suspend, Default background thread\n  doSomethingElse() // non-suspend, UI thread\n}",
			"textAlign": "left",
			"verticalAlign": "middle",
			"containerId": "QYFl4-Nhk9GIWfQKKoavi",
			"originalText": "GlobalScope.launch(Dispatchers.Main) {\n  doSomething() // non-suspend, UI thread\n  doLongRunningTask() // suspend, Default background thread\n  doSomethingElse() // non-suspend, UI thread\n}"
		},
		{
			"type": "rectangle",
			"version": 306,
			"versionNonce": 1154200771,
			"isDeleted": false,
			"id": "jxK2oWgCdmO02GtA9YzBa",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "dashed",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -28.631386037817606,
			"y": -799.4533561245526,
			"strokeColor": "#000",
			"backgroundColor": "#4c6ef5",
			"width": 535,
			"height": 202,
			"seed": 1597938362,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "QUdQcNm8"
				}
			],
			"updated": 1678908513550,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 424,
			"versionNonce": 109653229,
			"isDeleted": false,
			"id": "QUdQcNm8",
			"fillStyle": "cross-hatch",
			"strokeWidth": 0.5,
			"strokeStyle": "dashed",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -23.631386037817606,
			"y": -782.4533561245526,
			"strokeColor": "#000",
			"backgroundColor": "#be4bdb",
			"width": 515.625,
			"height": 168,
			"seed": 1951000826,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "   1. withContext() doesn't create new \n      coroutine it basically shift context. \n      also it is \n      suspend function.\n\n   2. launch and async are not \n      suspend function",
			"rawText": "   1. withContext() doesn't create new \n      coroutine it basically shift context. \n      also it is \n      suspend function.\n\n   2. launch and async are not \n      suspend function",
			"textAlign": "left",
			"verticalAlign": "middle",
			"containerId": "jxK2oWgCdmO02GtA9YzBa",
			"originalText": "   1. withContext() doesn't create new \n      coroutine it basically shift context. \n      also it is \n      suspend function.\n\n   2. launch and async are not \n      suspend function"
		},
		{
			"type": "rectangle",
			"version": 124,
			"versionNonce": 1671308387,
			"isDeleted": false,
			"id": "-gAwC4ETrWSKO5C9x2xe1",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "dashed",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -938.828638806719,
			"y": -668.5416639196205,
			"strokeColor": "#000000",
			"backgroundColor": "#15aabf",
			"width": 781,
			"height": 190,
			"seed": 882008013,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "LRsIpJeu"
				}
			],
			"updated": 1678908513550,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 55,
			"versionNonce": 1208944461,
			"isDeleted": false,
			"id": "LRsIpJeu",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "dashed",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -933.828638806719,
			"y": -633.5416639196205,
			"strokeColor": "#000000",
			"backgroundColor": "#4c6ef5",
			"width": 761.71875,
			"height": 120,
			"seed": 1496443437,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Within a coroutine, the processing sequence may be suspended and \nresumed later. This allows for asynchronous, non-blocking code, \nwithout using callbacks or promises. That is asynchronous \nprocessing, but everything related to that coroutine can happen \nin a single thread.",
			"rawText": "Within a coroutine, the processing sequence may be suspended and resumed later. This allows for asynchronous, non-blocking code, without using callbacks or promises. That is asynchronous processing, but everything related to that coroutine can happen in a single thread.",
			"textAlign": "left",
			"verticalAlign": "middle",
			"containerId": "-gAwC4ETrWSKO5C9x2xe1",
			"originalText": "Within a coroutine, the processing sequence may be suspended and resumed later. This allows for asynchronous, non-blocking code, without using callbacks or promises. That is asynchronous processing, but everything related to that coroutine can happen in a single thread."
		},
		{
			"type": "text",
			"version": 78,
			"versionNonce": 1237426179,
			"isDeleted": false,
			"id": "Sjsn8FsJ",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "dashed",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -8.875513806719255,
			"y": -445.7682264196203,
			"strokeColor": "#000",
			"backgroundColor": "#4c6ef5",
			"width": 811.5625,
			"height": 24,
			"seed": 1584875971,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 2,
			"text": "Coroutines are light-weight threads that allow you to write asynchronous non-blocking code.",
			"rawText": "Coroutines are light-weight threads that allow you to write asynchronous non-blocking code.",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Coroutines are light-weight threads that allow you to write asynchronous non-blocking code."
		},
		{
			"type": "rectangle",
			"version": 244,
			"versionNonce": 1688901037,
			"isDeleted": false,
			"id": "7ZGlwAyXKY-Jn7YLd8bo3",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "dashed",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -1563.8639658777954,
			"y": -267.2936339565116,
			"strokeColor": "#000000",
			"backgroundColor": "#15aabf",
			"width": 415,
			"height": 211,
			"seed": 1988673389,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "BBgNW1o2"
				}
			],
			"updated": 1678908513550,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 241,
			"versionNonce": 20228003,
			"isDeleted": false,
			"id": "BBgNW1o2",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "dashed",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -1555.5827158777954,
			"y": -245.7936339565116,
			"strokeColor": "#000000",
			"backgroundColor": "#15aabf",
			"width": 398.4375,
			"height": 168,
			"seed": 1000413891,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Within a coroutine, the processing\nsequence may be suspended and \nresumed later. This allows for \nasynchronous, non-blocking code, \nwithout using callbacks or \npromises. That is asynchronous \nprocessing",
			"rawText": "Within a coroutine, the processing sequence may be suspended and resumed later. This allows for asynchronous, non-blocking code, without using callbacks or promises. That is asynchronous processing",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "7ZGlwAyXKY-Jn7YLd8bo3",
			"originalText": "Within a coroutine, the processing sequence may be suspended and resumed later. This allows for asynchronous, non-blocking code, without using callbacks or promises. That is asynchronous processing"
		},
		{
			"type": "rectangle",
			"version": 662,
			"versionNonce": 1468356621,
			"isDeleted": false,
			"id": "xBVOv6WSIAy5lkDFUXxbn",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 5.967854133905104,
			"x": -1529.50515888849,
			"y": -392.07453476468373,
			"strokeColor": "#000000",
			"backgroundColor": "#868e96",
			"width": 362,
			"height": 145,
			"seed": 1228199789,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "ZGsWLYDg"
				}
			],
			"updated": 1678908513550,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 740,
			"versionNonce": 1344650051,
			"isDeleted": false,
			"id": "ZGsWLYDg",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "dashed",
			"roughness": 2,
			"opacity": 100,
			"angle": 5.967854133905104,
			"x": -1504.36453388849,
			"y": -353.17453476468376,
			"strokeColor": "#000000",
			"backgroundColor": "#15aabf",
			"width": 311.71875,
			"height": 67.2,
			"seed": 1675187331,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 3,
			"text": "All this happen in \nSingle Thread",
			"rawText": "All this happen in Single Thread",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "xBVOv6WSIAy5lkDFUXxbn",
			"originalText": "All this happen in Single Thread"
		},
		{
			"type": "ellipse",
			"version": 136,
			"versionNonce": 2056834669,
			"isDeleted": false,
			"id": "UXXgFQt2nVahGrsC6nkwf",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "dashed",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": 97.71799178778133,
			"y": 356.61485150918406,
			"strokeColor": "#000000",
			"backgroundColor": "#868e96",
			"width": 282,
			"height": 198,
			"seed": 525244739,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [
				{
					"type": "text",
					"id": "uk3WsxzS"
				}
			],
			"updated": 1678908513550,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 95,
			"versionNonce": 854809315,
			"isDeleted": false,
			"id": "uk3WsxzS",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "dashed",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": 154.14093564047812,
			"y": 412.4112801717159,
			"strokeColor": "#000000",
			"backgroundColor": "#868e96",
			"width": 168.75,
			"height": 86.39999999999999,
			"seed": 1760896525,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false,
			"fontSize": 36,
			"fontFamily": 3,
			"text": "Multiple\n jobs",
			"rawText": "Multiple  jobs",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "UXXgFQt2nVahGrsC6nkwf",
			"originalText": "Multiple  jobs"
		},
		{
			"type": "text",
			"version": 130,
			"versionNonce": 749631693,
			"isDeleted": false,
			"id": "mSHtrgXS",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -788.7612683959112,
			"y": -286.6563073014371,
			"strokeColor": "#840b0b",
			"backgroundColor": "#868e96",
			"width": 278.90625,
			"height": 67.2,
			"seed": 2121345667,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 3,
			"text": "Coroutine Builder\n",
			"rawText": "Coroutine Builder\n",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Coroutine Builder\n"
		},
		{
			"type": "rectangle",
			"version": 346,
			"versionNonce": 248205453,
			"isDeleted": false,
			"id": "tfpqYpEswhBgRSXSy6UcE",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -1595.7759805238643,
			"y": 332.60623684928964,
			"strokeColor": "#3b3b3b",
			"backgroundColor": "#868e96",
			"width": 1060,
			"height": 582,
			"seed": 696827331,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"id": "a0eUp6gT",
					"type": "text"
				}
			],
			"updated": 1678976978661,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 611,
			"versionNonce": 929027885,
			"isDeleted": false,
			"id": "a0eUp6gT",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -1590.7759805238643,
			"y": 338.0062368492896,
			"strokeColor": "#3b3b3b",
			"backgroundColor": "#868e96",
			"width": 1050,
			"height": 571.2,
			"seed": 1527510115,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 3,
			"text": "fun main() = runBlocking {\n    doWorld()\n    println(\"Done\")\n}\n\n// Concurrently executes both sections\nsuspend fun doWorld() = coroutineScope { // this: CoroutineScope\n    launch {\n        delay(2000L)\n        println(\"World 2\")\n    }\n    launch {\n        delay(1000L)\n        println(\"World 1\")\n    }\n    println(\"Hello\")\n}",
			"rawText": "fun main() = runBlocking {\n    doWorld()\n    println(\"Done\")\n}\n\n// Concurrently executes both sections\nsuspend fun doWorld() = coroutineScope { // this: CoroutineScope\n    launch {\n        delay(2000L)\n        println(\"World 2\")\n    }\n    launch {\n        delay(1000L)\n        println(\"World 1\")\n    }\n    println(\"Hello\")\n}",
			"textAlign": "left",
			"verticalAlign": "middle",
			"containerId": "tfpqYpEswhBgRSXSy6UcE",
			"originalText": "fun main() = runBlocking {\n    doWorld()\n    println(\"Done\")\n}\n\n// Concurrently executes both sections\nsuspend fun doWorld() = coroutineScope { // this: CoroutineScope\n    launch {\n        delay(2000L)\n        println(\"World 2\")\n    }\n    launch {\n        delay(1000L)\n        println(\"World 1\")\n    }\n    println(\"Hello\")\n}"
		},
		{
			"type": "rectangle",
			"version": 179,
			"versionNonce": 1351499299,
			"isDeleted": false,
			"id": "8ffHy2CFpT5apeJZEHwLn",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -791.0581418341202,
			"y": -230.27620947369195,
			"strokeColor": "#000000",
			"backgroundColor": "#868e96",
			"width": 290,
			"height": 178,
			"seed": 2013329005,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "mFrVsSGD"
				}
			],
			"updated": 1678908513550,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 180,
			"versionNonce": 1964403085,
			"isDeleted": false,
			"id": "mFrVsSGD",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -786.0581418341202,
			"y": -208.47620947369194,
			"strokeColor": "#000000",
			"backgroundColor": "#868e96",
			"width": 278.90625,
			"height": 134.4,
			"seed": 170661677,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 3,
			"text": "1. launch()\n2. async()\n3. runBlocking() \nis regular fun",
			"rawText": "1. launch()\n2. async()\n3. runBlocking() is regular fun",
			"textAlign": "left",
			"verticalAlign": "middle",
			"containerId": "8ffHy2CFpT5apeJZEHwLn",
			"originalText": "1. launch()\n2. async()\n3. runBlocking() is regular fun"
		},
		{
			"type": "rectangle",
			"version": 457,
			"versionNonce": 1560838595,
			"isDeleted": false,
			"id": "4OGzFjH9XulA4uw6WdIcF",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -1021.9793713487724,
			"y": 197.43675595172,
			"strokeColor": "#840b0b",
			"backgroundColor": "#868e96",
			"width": 521,
			"height": 178,
			"seed": 1158416099,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "LDuXpT48"
				}
			],
			"updated": 1678908513550,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 481,
			"versionNonce": 923512813,
			"isDeleted": false,
			"id": "LDuXpT48",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -1015.7762463487724,
			"y": 236.03675595171998,
			"strokeColor": "#840b0b",
			"backgroundColor": "#868e96",
			"width": 508.59375,
			"height": 100.80000000000001,
			"seed": 2131522435,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513550,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 3,
			"text": "coroutineScope { }\nthis can only call from suspend\nfun or coroutine",
			"rawText": "coroutineScope { }\nthis can only call from suspend fun or coroutine",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "4OGzFjH9XulA4uw6WdIcF",
			"originalText": "coroutineScope { }\nthis can only call from suspend fun or coroutine"
		},
		{
			"type": "text",
			"version": 103,
			"versionNonce": 1421431139,
			"isDeleted": false,
			"id": "fZwfJ5DU",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -764.9735923836786,
			"y": 665.2853619516645,
			"strokeColor": "#3b3b3b",
			"backgroundColor": "#868e96",
			"width": 82.03125,
			"height": 33.6,
			"seed": 1927177677,
			"groupIds": [
				"QzrObXDsJNl0iVgBVBxYg"
			],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513551,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 3,
			"text": "Hello",
			"rawText": "Hello",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Hello"
		},
		{
			"type": "text",
			"version": 104,
			"versionNonce": 1799957069,
			"isDeleted": false,
			"id": "3Y2QjtU4",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -764.9735923836786,
			"y": 709.1456031935078,
			"strokeColor": "#3b3b3b",
			"backgroundColor": "#868e96",
			"width": 114.84375,
			"height": 33.6,
			"seed": 2096982403,
			"groupIds": [
				"QzrObXDsJNl0iVgBVBxYg"
			],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513551,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 3,
			"text": "World 1",
			"rawText": "World 1",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "World 1"
		},
		{
			"type": "text",
			"version": 104,
			"versionNonce": 686763267,
			"isDeleted": false,
			"id": "03vlqwlH",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -764.9735923836786,
			"y": 752.7456031935078,
			"strokeColor": "#3b3b3b",
			"backgroundColor": "#868e96",
			"width": 114.84375,
			"height": 33.6,
			"seed": 1795826733,
			"groupIds": [
				"QzrObXDsJNl0iVgBVBxYg"
			],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513551,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 3,
			"text": "World 2",
			"rawText": "World 2",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "World 2"
		},
		{
			"type": "text",
			"version": 104,
			"versionNonce": 44587181,
			"isDeleted": false,
			"id": "ap2pHoL2",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -764.9735923836786,
			"y": 796.3456031935078,
			"strokeColor": "#3b3b3b",
			"backgroundColor": "#868e96",
			"width": 65.625,
			"height": 33.6,
			"seed": 1027293475,
			"groupIds": [
				"QzrObXDsJNl0iVgBVBxYg"
			],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513551,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 3,
			"text": "Done",
			"rawText": "Done",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Done"
		},
		{
			"type": "rectangle",
			"version": 55,
			"versionNonce": 95375523,
			"isDeleted": false,
			"id": "My7usSvmBScqZGpzrpdCC",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -475.1451001736704,
			"y": 1085.4872739090629,
			"strokeColor": "#3b3b3b",
			"backgroundColor": "#868e96",
			"width": 597,
			"height": 279,
			"seed": 999703267,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "BA0ObsPO"
				}
			],
			"updated": 1678976959444,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 374,
			"versionNonce": 1972880355,
			"isDeleted": false,
			"id": "BA0ObsPO",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -468.4712720486704,
			"y": 1124.187273909063,
			"strokeColor": "#c85b5b",
			"backgroundColor": "#868e96",
			"width": 583.65234375,
			"height": 201.60000000000002,
			"seed": 2096443139,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678976964194,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 2,
			"text": "Q How parent coroutine help in leak can be \nmemory.\nAns:- if there are many coroutine present in \nparent coroutine and after certain point of time \nif any crash then parent coroutine cancel its all \ncoroutine and help in memory leak.",
			"rawText": "Q How parent coroutine help in leak can be memory.\nAns:- if there are many coroutine present in parent coroutine and after certain point of time if any crash then parent coroutine cancel its all coroutine and help in memory leak.",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "My7usSvmBScqZGpzrpdCC",
			"originalText": "Q How parent coroutine help in leak can be memory.\nAns:- if there are many coroutine present in parent coroutine and after certain point of time if any crash then parent coroutine cancel its all coroutine and help in memory leak."
		},
		{
			"type": "image",
			"version": 340,
			"versionNonce": 18090051,
			"isDeleted": false,
			"id": "CkD_liAB8obWkPMoNjAcl",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -148.2127472179253,
			"y": 1457.0243117979996,
			"strokeColor": "transparent",
			"backgroundColor": "#fa5252",
			"width": 1166.4263275168184,
			"height": 349.08874262373854,
			"seed": 2100125005,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513551,
			"link": null,
			"locked": false,
			"status": "pending",
			"fileId": "c70996bee6098ce0090d63b4d334d40053e6df5e",
			"scale": [
				1,
				1
			]
		},
		{
			"type": "image",
			"version": 129,
			"versionNonce": 1346490733,
			"isDeleted": false,
			"id": "dpc2mi8dWa-xnre1k7P6G",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -1338.9515135719917,
			"y": 1456.0267512958217,
			"strokeColor": "transparent",
			"backgroundColor": "#868e96",
			"width": 1106.1879701570201,
			"height": 505.39904234102886,
			"seed": 2145804867,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513551,
			"link": null,
			"locked": false,
			"status": "pending",
			"fileId": "20093ffa25f0cdf367e6f0a35b83adcc558649c2",
			"scale": [
				1,
				1
			]
		},
		{
			"type": "freedraw",
			"version": 5,
			"versionNonce": 714082275,
			"isDeleted": false,
			"id": "Not9MDN1VWGdgX9ASLmaD",
			"fillStyle": "hachure",
			"strokeWidth": 0.5,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -297.1044197008174,
			"y": 1483.8787765206719,
			"strokeColor": "#c85b5b",
			"backgroundColor": "#fa5252",
			"width": 0.0001,
			"height": 0.0001,
			"seed": 822145261,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513551,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0.0001,
					0.0001
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": false,
			"pressures": [
				0,
				0
			]
		},
		{
			"type": "freedraw",
			"version": 32,
			"versionNonce": 205462477,
			"isDeleted": false,
			"id": "IDIy9SBaEBKtHuV8hzQuT",
			"fillStyle": "hachure",
			"strokeWidth": 4,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -398.2454659164124,
			"y": 1453.1029329713194,
			"strokeColor": "#c85b5b",
			"backgroundColor": "#fa5252",
			"width": 129.63807988397105,
			"height": 185.86195712157746,
			"seed": 241736707,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513551,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0,
					0.45258593454923357
				],
				[
					0,
					2.167648423367609
				],
				[
					-1.0163333267071257,
					7.932164010785073
				],
				[
					-6.4870650618731815,
					19.350033728011113
				],
				[
					-17.087104055264604,
					34.92057789732985
				],
				[
					-30.839364382271242,
					54.064168918353516
				],
				[
					-44.77424710392063,
					73.28716098052632
				],
				[
					-57.42283295895618,
					90.17576243291842
				],
				[
					-68.2690151799095,
					105.61926493639862
				],
				[
					-76.21705939892433,
					117.27533777707185
				],
				[
					-84.14128330559447,
					127.62923354290137
				],
				[
					-94.24109573974715,
					141.0083089765078
				],
				[
					-102.91962953733275,
					151.9974130715293
				],
				[
					-109.962501887249,
					160.5489052032765
				],
				[
					-116.56072840673085,
					168.9812957733002
				],
				[
					-121.0230669193046,
					174.62670979899394
				],
				[
					-124.06412679531115,
					178.0568347766307
				],
				[
					-125.86653042939349,
					180.16096236707926
				],
				[
					-127.00990542193915,
					181.55842069130154
				],
				[
					-127.85155645811847,
					183.01145974432825
				],
				[
					-128.60586634903405,
					184.45655869324014
				],
				[
					-129.08227259592798,
					185.29820972941957
				],
				[
					-129.18549394942158,
					185.7269753516241
				],
				[
					-129.46339759344312,
					185.86195712157746
				],
				[
					-129.63807988397105,
					185.47289201994727
				],
				[
					-129.63807988397105,
					183.8372305722778
				],
				[
					-129.63807988397105,
					179.9942201806664
				],
				[
					-129.63807988397105,
					179.9942201806664
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "freedraw",
			"version": 58,
			"versionNonce": 799740803,
			"isDeleted": false,
			"id": "QuTR1IxGuRoCfQTttoxM0",
			"fillStyle": "hachure",
			"strokeWidth": 4,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -569.5214517789186,
			"y": 1438.5804825451676,
			"strokeColor": "#c85b5b",
			"backgroundColor": "#fa5252",
			"width": 210.9526861246611,
			"height": 192.05523833119923,
			"seed": 947255907,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513551,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0.2540833316768385,
					0.2540833316768385
				],
				[
					0.7225494744559455,
					0.5081666633534496
				],
				[
					1.492739573601284,
					0.5081666633534496
				],
				[
					4.629080698986741,
					0.5081666633534496
				],
				[
					11.473450446030483,
					0.5081666633534496
				],
				[
					22.287872250524174,
					0.5081666633534496
				],
				[
					34.984098730249116,
					4.04945309859886
				],
				[
					48.62519759964721,
					12.386562419243774
				],
				[
					65.67260113433736,
					25.106609211313526
				],
				[
					85.5228614215871,
					44.583684605162944
				],
				[
					103.19753318135429,
					64.1163407278168
				],
				[
					115.92552007753886,
					77.56687709845733
				],
				[
					125.48540543187846,
					88.36541869472126
				],
				[
					132.07569184724537,
					96.94073113881291
				],
				[
					135.91076213474196,
					102.65760610154098
				],
				[
					138.45953555562494,
					107.27874669641278
				],
				[
					140.94478814358854,
					111.54258260611391
				],
				[
					143.87468656198666,
					116.33840549151341
				],
				[
					146.57432196105265,
					120.7292830670533
				],
				[
					148.37672559513487,
					123.73858252660034
				],
				[
					149.59156152471462,
					125.9379913664277
				],
				[
					150.5681943308473,
					127.37515021122431
				],
				[
					150.95725943247737,
					128.38354343381684
				],
				[
					150.95725943247737,
					129.0187517630086
				],
				[
					151.10018130654555,
					129.32841582348988
				],
				[
					151.5289469287502,
					129.7571814456944
				],
				[
					152.42617869373385,
					131.19434029049125
				],
				[
					154.68910836648035,
					134.0765980842
				],
				[
					158.24627500995553,
					138.07047045399463
				],
				[
					162.05752498510742,
					142.58044959125777
				],
				[
					165.39236871336539,
					146.614022481627
				],
				[
					167.76645984372044,
					149.65508235763355
				],
				[
					169.28301972966642,
					151.48130630406058
				],
				[
					170.40257440986727,
					152.60086098426154
				],
				[
					171.23628534193176,
					153.70453545623263
				],
				[
					172.41936085505188,
					155.18139482160404
				],
				[
					174.28528532205337,
					157.36492345320153
				],
				[
					176.47675405776567,
					159.88987656173958
				],
				[
					178.63646237701846,
					162.3513088373586
				],
				[
					180.47062642756032,
					164.5189572607262
				],
				[
					182.4080118315959,
					166.83746766227705
				],
				[
					185.36173056233872,
					170.1405509740755
				],
				[
					190.47515761233421,
					175.16663687880714
				],
				[
					196.63667840549658,
					181.07407434029255
				],
				[
					202.20269139004142,
					186.21132170263286
				],
				[
					205.9107200116997,
					189.31590241155868
				],
				[
					207.5781418758287,
					190.6736602152066
				],
				[
					208.60241530665076,
					191.64235291722434
				],
				[
					209.26938405230237,
					192.05523833119923
				],
				[
					209.45994655105994,
					191.84085552009697
				],
				[
					209.45994655105994,
					190.76100136047057
				],
				[
					210.17455592140095,
					186.79888940713545
				],
				[
					210.9526861246611,
					180.55002746870923
				],
				[
					210.9526861246611,
					180.55002746870923
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "freedraw",
			"version": 43,
			"versionNonce": 1122245165,
			"isDeleted": false,
			"id": "XnajUy_0Iv_hItoLoAOYP",
			"fillStyle": "hachure",
			"strokeWidth": 4,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": 376.1608285138917,
			"y": 1741.320772238072,
			"strokeColor": "#5c940d",
			"backgroundColor": "#fa5252",
			"width": 245.785922876727,
			"height": 218.0828996198411,
			"seed": 877613571,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678908513551,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0.21438281110226853,
					0
				],
				[
					1.0480937431667599,
					1.1102230246251565e-16
				],
				[
					4.875223926548529,
					0.420825518089714
				],
				[
					11.552851487179282,
					3.453945289981675
				],
				[
					18.095497277856794,
					8.662653589356069
				],
				[
					24.79694515083247,
					14.951216048356628
				],
				[
					32.20506229003399,
					22.383153499903074
				],
				[
					39.31145547286951,
					30.291497198343222
				],
				[
					45.433275745457195,
					37.46141121409801
				],
				[
					51.698017892113285,
					43.607051799030614
				],
				[
					57.31961160546257,
					49.165124679460405
				],
				[
					60.82119752013341,
					52.960494446382654
				],
				[
					62.94914542292645,
					54.905819954532944
				],
				[
					64.17192145662102,
					56.02537463473391
				],
				[
					64.60862718294061,
					57.00200744086669
				],
				[
					64.60862718294061,
					57.01788764909634
				],
				[
					64.60862718294061,
					56.15241630057244
				],
				[
					64.60862718294061,
					53.365439756242495
				],
				[
					65.47409853146473,
					43.74203356898374
				],
				[
					74.22409326608431,
					20.294906117684377
				],
				[
					98.09204623547362,
					-19.175351437483187
				],
				[
					131.06729862465295,
					-62.901504798237056
				],
				[
					162.36718904558847,
					-97.19481447048975
				],
				[
					189.0221185593075,
					-121.42801222916432
				],
				[
					209.64256894570258,
					-136.67301212977236
				],
				[
					222.54523813241485,
					-143.42210062743698
				],
				[
					230.96968859832373,
					-145.7644313413325
				],
				[
					236.9088864762689,
					-146.24083758822644
				],
				[
					240.75189686788053,
					-146.24083758822644
				],
				[
					243.3324307052228,
					-146.24083758822644
				],
				[
					244.76164944590482,
					-146.24083758822644
				],
				[
					245.54771975328003,
					-146.24083758822644
				],
				[
					245.785922876727,
					-146.05027508946887
				],
				[
					245.785922876727,
					-145.82001207013695
				],
				[
					245.785922876727,
					-145.55004853023047
				],
				[
					245.3492171504074,
					-145.74855113310286
				],
				[
					244.35670413604498,
					-147.26511101904862
				],
				[
					240.0293473934246,
					-152.37853806904423
				],
				[
					229.69133183582494,
					-161.06501197074476
				],
				[
					229.69133183582494,
					-161.06501197074476
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "text",
			"version": 184,
			"versionNonce": 1072045517,
			"isDeleted": false,
			"id": "EarycPCx",
			"fillStyle": "hachure",
			"strokeWidth": 4,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": 570.7661453669767,
			"y": 988.3014379774287,
			"strokeColor": "#5c940d",
			"backgroundColor": "#fa5252",
			"width": 667.7716674804688,
			"height": 201.60000000000002,
			"seed": 1151304099,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678975939130,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 1,
			"text": "Lightweight: You can run many coroutines \non a single thread due to support for \nsuspension, which doesn't block the thread where\nthe coroutine is running. Suspending saves \nmemory over blocking while supporting many \nconcurrent operations.",
			"rawText": "Lightweight: You can run many coroutines \non a single thread due to support for \nsuspension, which doesn't block the thread where\nthe coroutine is running. Suspending saves \nmemory over blocking while supporting many \nconcurrent operations.",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Lightweight: You can run many coroutines \non a single thread due to support for \nsuspension, which doesn't block the thread where\nthe coroutine is running. Suspending saves \nmemory over blocking while supporting many \nconcurrent operations."
		},
		{
			"type": "text",
			"version": 275,
			"versionNonce": 123441901,
			"isDeleted": false,
			"id": "6A5IIdZE",
			"fillStyle": "hachure",
			"strokeWidth": 4,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": 573.6834678537634,
			"y": 1205.1696073506023,
			"strokeColor": "#5c940d",
			"backgroundColor": "#fa5252",
			"width": 621.99169921875,
			"height": 67.2,
			"seed": 1760539875,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678976009113,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 1,
			"text": "Fewer memory leaks: Use structured \nconcurrency to run operations within a scope.",
			"rawText": "Fewer memory leaks: Use structured \nconcurrency to run operations within a scope.",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Fewer memory leaks: Use structured \nconcurrency to run operations within a scope."
		},
		{
			"type": "rectangle",
			"version": 51,
			"versionNonce": 1474289763,
			"isDeleted": false,
			"id": "_G_k3UA3dX3KywBV1ugzX",
			"fillStyle": "hachure",
			"strokeWidth": 4,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -2172.5276937946237,
			"y": 1225.954952795479,
			"strokeColor": "#343a40",
			"backgroundColor": "#868e96",
			"width": 606,
			"height": 116,
			"seed": 524361421,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "ZFAd3uAi"
				}
			],
			"updated": 1678976919917,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 77,
			"versionNonce": 2128022349,
			"isDeleted": false,
			"id": "ZFAd3uAi",
			"fillStyle": "hachure",
			"strokeWidth": 4,
			"strokeStyle": "solid",
			"roughness": 2,
			"opacity": 100,
			"angle": 0,
			"x": -2130.9915609821237,
			"y": 1267.154952795479,
			"strokeColor": "#000000",
			"backgroundColor": "#fa5252",
			"width": 522.927734375,
			"height": 33.6,
			"seed": 2007193027,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1678976919917,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 1,
			"text": "Out of memory if thread exceed 100K",
			"rawText": "Out of memory if thread exceed 100K",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "_G_k3UA3dX3KywBV1ugzX",
			"originalText": "Out of memory if thread exceed 100K"
		}
	],
	"appState": {
		"theme": "dark",
		"viewBackgroundColor": "#ffffff",
		"currentItemStrokeColor": "#000000",
		"currentItemBackgroundColor": "#868e96",
		"currentItemFillStyle": "hachure",
		"currentItemStrokeWidth": 1,
		"currentItemStrokeStyle": "solid",
		"currentItemRoughness": 2,
		"currentItemOpacity": 100,
		"currentItemFontFamily": 1,
		"currentItemFontSize": 28,
		"currentItemTextAlign": "left",
		"currentItemStartArrowhead": null,
		"currentItemEndArrowhead": "arrow",
		"scrollX": 2503.2404891762535,
		"scrollY": 1232.3213932624785,
		"zoom": {
			"value": 0.2
		},
		"currentItemRoundness": "round",
		"gridSize": null,
		"colorPalette": {},
		"currentStrokeOptions": null,
		"previousGridSize": null
	},
	"files": {}
}
```
%%