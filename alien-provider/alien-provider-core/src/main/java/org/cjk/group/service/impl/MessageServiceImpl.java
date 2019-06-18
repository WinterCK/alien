package org.cjk.group.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageServiceImpl {

	@Value("${spring.application.name}")
	private String serviceName;
	
	@RequestMapping(value = "/message/{name}",method = RequestMethod.GET)
	public String sendMessage(@PathVariable("name") String name) {
		String line = System.lineSeparator();
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("     _                      _______                      _"  ).append(line)
					.append("  _dMMMb._              .adOOOOOOOOOba.              _,dMMMb_").append(line)
					.append(" dP'  ~YMMb            dOOOOOOOOOOOOOOOb            aMMP~  `Yb").append(line)
					.append(" V      ~Mb          dOOOOOOOOOOOOOOOOOb          dM~      V").append(line)
					.append("          `Mb.       dOOOOOOOOOOOOOOOOOOOb       ,dM'").append(line)
					.append("           `YMb._   |OOOOOOOOOOOOOOOOOOOOO|   _,dMP'").append(line)
					.append("      __     `YMMM| OP'~ YOOOOOOOOOOOP ~`YO |MMMP'     __").append(line)
					.append("   ,dMMMb.     ~~' OO     `YOOOOOP'     OO `~~     ,dMMMb.").append(line)
					.append(" _,dP~  `YMba_      OOb      `OOO'      dOO      _aMMP'  ~Yb._").append(line)
					.append("             `YMMMM  OOOo     OOO     oOOO /MMMMP ").append(line)
					.append("     ,aa.     `~YMMb `OOOb._,dOOOb._,dOOO'dMMP~'       ,aa.").append(line)
					.append("   ,dMYYMba._         `OOOOOOOOOOOOOOOOO'          _,adMYYMb.").append(line)
					.append("  ,MP'   `YMMba._      OOOOOOOOOOOOOOOOO       _,adMMP'   `YM.").append(line)
					.append("  MP'        ~YMMMba._ YOOOOPVVVVVYOOOOP  _,adMMMMP~       `YM").append(line)
					.append("  YMb           ~YMMMM `OOOOI`````IOOOOO'/MMMMP~           dMP").append(line)
					.append("   `Mb.           `YMMMb`OOOI,,,,,IOOOO'dMMMP'           ,dM'").append(line)
					.append("     `'                  `OObNNNNNdOO'                   `'").append(line)
					.append("                           `~OOOOO~'       ---").append(name);
				return stringBuffer.toString();
	}
}
