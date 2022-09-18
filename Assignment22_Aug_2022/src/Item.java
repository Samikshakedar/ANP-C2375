
public abstract class Item {
  private int uid;
  private String title;
  int noOfCopies;
  
  void displayItem(int uid, String title,int numCop) {
	  this.uid=uid;
	  this.title=title;
	  this.noOfCopies=numCop;
  }

public int getUid() {
	return uid;
}

public void setUid(int uid) {
	this.uid = uid;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public int getNoOfCopies() {
	return noOfCopies;
}

public void setNoOfCopies(int noOfCopies) {
	this.noOfCopies = noOfCopies;
}
  
  
}
