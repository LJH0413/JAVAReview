package java06_object.final_ex;

public class Earth {
	
	// static final = 상수 
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static { //static 의 상수 EARTH_SURFACE_AREA 초기
		EARTH_SURFACE_AREA = (4 * EARTH_RADIUS * EARTH_RADIUS * Math.PI);
	}
	
	//static final : 모든 객체에서 참조할 경우 객체 내부에 상수를 로드하지 않고
	// static영역에 저장해서 모든 객체들이 공우해서 사용하도록 설 
}


// 객체의 필드 자동 초기화 p.202: 객체의 필드의 초기값을 넣ㅈ ㅣ않는 경우 필드 데이터형에 따라 기본값 들어
