package oop1;

public class Counter {
	
	int value;

	Counter () { } //Emulating default constructor (default = 0)

	Counter (int value) { this.value = value; }
	
	void Inc () { value++; }
	
	void Dec () { value--; }

	void Reset () { value = 0; }
}
