

/*	
	How to run the code
	
	Need node for running the code (Download & Install from https://nodejs.org/)
	Need typescript (Use the command if it is missing: npm install -g typescript) (need npm also)
	
	To run the program,
	*)	Navigate to the folder
	*)	tsc BubbleSorting_TypeScript_Solution.ts (will compile ts file into js file with same name)
	*)	node BubbleSorting_TypeScript_Solution.js (will execute the js)
	

*/
var array = [7, 4, -9, -6, 2];
array = bubbleSort(array);
console.log(array);

export function bubbleSort(array: number[]): number[] {
	var arraySize = array.length;
	
	if(arraySize == 0)
		return [];
	
	for(var i=0; i < arraySize-1; i++){
		for(var j=0; j < (arraySize-1-i); j++) {
			if(array[j] > array[j+1]){
				// Swap both elements
				var tmp = array[j];
				array[j] = array[j+1];
				array[j+1] = tmp;
			}
		}
	}
	return array;
}