package com.yangjinjing.cms;
/** 
* @author 作者:杨今敬
* @version 创建时间：2019年12月24日 下午8:10:27
* 类功能说明 
*/
public class TestImportData {
/*	*//**
	 * 导入文本数据
	 * @author zhuzg
	 *
	 *//*
	@RunWith(SpringRunner.class)
	@ContextConfiguration("classpath:spring-beans.xml")
	public class DataImport {
		
		@Autowired
		CarService carServie;

		@Test
		public void testImport() {
			
			
			
			List<String> lines;
			try {
				lines = FileUtils.readByLines("d:\\cardata.txt");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("文件解析错误！！！");
				return;
			}
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			for (String carStr : lines) {
				Car car = new Car();
				String[] carData = carStr.split("\\|");
				if(carData.length!=4) {
					System.out.println(" 数据 不合法  长度 " + carStr);
					continue;
				}
				
				// 车牌号
				car.setCarno(carData[0]);
				//
				try {
					car.setLongitude(Double.parseDouble(carData[1]));	
					car.setLatitude(Double.parseDouble(carData[2]));	
				} catch (NumberFormatException e) {
					// TODO: handle exception
					System.out.println("精度或维度不合法" +  carStr);
					continue;
				}
				try {
					car.setZptime(format.parse(carData[3]));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					//
					System.out.println("日期解析错误  " + carStr);
					continue;
				}
				car.setDistance(CalculateUtils.calBylw(car.getLongitude(), car.getLatitude(), 116.38, 39.90));
				System.out.println(" car is  " + car);
				carServie.add(car);
			}
			
		}

	}

*/}
