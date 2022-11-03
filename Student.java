//Create a class Student with 3 private data members:

package Collection.com;

public class Student {
	


	private int id;
	private String name;
	private String contno;
	
	public Student() { 
		super();
	}
	
	public Student(int id, String name, String contno) {  
		super();
		this.id = id;
		this.name = name;
		this.contno = contno;
	}

	//generate getters and setter
	public int getId() {  //get id
		return id;
	}

	public void setId(int id) { 
		this.id = id;
	}

	public String getName() { 
		return name;
	}

	public void setName(String name) { 
		this.name = name;
	}

	public String getContno() { 
		return contno;
	}

	public void setContno(String contno) { 
		this.contno = contno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contno=" + contno + "]";
	}

	
	}
	
	


