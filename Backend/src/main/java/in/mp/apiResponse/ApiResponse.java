package in.mp.apiResponse;

public class ApiResponse<T> {
	
	private String msg;
    private T data;
    
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	public ApiResponse(String msg ,T data) {
		this.msg=msg;
		this.data=data;
	}
    

}
