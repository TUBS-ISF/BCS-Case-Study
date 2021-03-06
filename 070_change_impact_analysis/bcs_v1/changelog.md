BCS version 1 at t1 Wiper
=========================

Describtion:
------------
First evolution of the BCS case study. In time step t1 the wiper functionality was introduced to the system. The model is based on the data provided by Nahrendorfer et al. [NLS+18]. 

addSWBlocks{
	WiperSystem
	LEDFrostProtection
	LEDClean
	LEDWiper
	Wip_Speed_Panel
	Wip_Function_Panel
	ScreenWashController
	WindShieldTemperatureControl
	RainSensorController
	WiperController
	ScreenWashNozzle
	HighQualityWiper
	LowQualityWiper
	HighQualityRainSensor
	LowQualityRainSensor
	ScreenWashSensor
	WindShieldTemperatureSensor
	WiperSystem
	ScreenWashController_1
	WindShieldTemperatureControl_1
	RainSensorController_1
	WiperController_1
	ScreenWashNozzle
	HighQualityWiper
	LowQualityWiper
	HighQualityRainSensor
	LowQualityRainSensor
	ScreenWashSensor
	WindShieldtemperatureSensor
	LEDFrostProtection
	LEDClean
	LEDWiper
	Wip_Speed_Panel
	Wip_Function_Panel
	Impl_WiperController
	Impl_ScreenWashController
	Impl_RainSensorController
	Impl_WindShieldTemperatureCo
}

removeSWBlock{
}

updateSWBlock{
	ManPW(ParentFeatureChange)
	AutoPW(ParentFeatureChange)
	Power_Window(ParentFeatureChange)
	ManPW(ParentFeatureChange)
	Power_Window(ParentFeatureChange)
	LED_AlarmSystemInteriorMonit(ParentFeatureChange)
	LED_AlarmSystemAlarm(ParentFeatureChange)
	LED_AlarmSystemAlarmDetected(ParentFeatureChange)
	LED_AlaramSystemActive(ParentFeatureChange)
	LED_CentralLockingSystem(ParentFeatureChange)
	LED_FingerProtection(ParentFeatureChange)
	LED_ExteriorMirrorHeating(ParentFeatureChange)
	LED_ExteriorMirrorBottom(ParentFeatureChange)
	LED_ExteriorMirrorRight(ParentFeatureChange)
	LED_ExteriorMirrorLeft(ParentFeatureChange)
	LED_ExteriorMirrorTop(ParentFeatureChange)
	LED_AutomaticPowerWindow(ParentFeatureChange)
	LED_ManualPowerWindow(ParentFeatureChange)
	HumanMachineInterface(ParentFeatureChange)
	CentralLockingSystem(ParentFeatureChange)
	RemoteControlKeyController(ParentFeatureChange)
	AlarmSystem(ParentFeatureChange)
	FingerProtection(ParentFeatureChange)
	ExteriorMirror(ParentFeatureChange)
	PW_Remote_Control(ParentFeatureChange)
	Remote_Cotroll_Key(ParentFeatureChange)
	PW_Button_DN(ParentFeatureChange)
	PW_Button_UP(ParentFeatureChange)
	Alarm_System_Control(ParentFeatureChange)
	EM_Button(ParentFeatureChange)
	Alarm_Sensor(ParentFeatureChange)
	LED_ASIM(ParentFeatureChange)
	LED_ASAC(ParentFeatureChange)
	LED_ASA(ParentFeatureChange)
	LED_ASAD(ParentFeatureChange)
	LED_PW_CLS_UP(ParentFeatureChange)
	LED_PW_down(ParentFeatureChange)
	LED_PW_UP(ParentFeatureChange)
	LED_Heating(ParentFeatureChange)
	LED_EM_Left(ParentFeatureChange)
	LED_EM_Right(ParentFeatureChange)
	LED_EM_Top(ParentFeatureChange)
	LED_EM_Bottom(ParentFeatureChange)
	EM_Motor(ParentFeatureChange)
	LED_FP(ParentFeatureChange)
	Heating_timer(ParentFeatureChange)
	Thermometer(ParentFeatureChange)
	EM_Pos_Sensor(ParentFeatureChange)
	Finger_Sensor_SWA(ParentFeatureChange)
	PW_pos_Sensor(ParentFeatureChange)
	Car_locking_system(ParentFeatureChange)
	door_sensor(ParentFeatureChange)
	driving_sensor(ParentFeatureChange)
	Key_Pos_Sensor(ParentFeatureChange)
	CLS_LED(ParentFeatureChange)
	System_Software_Architecture(ComposedOfChange)
	RemoteControlKeyController_1(ParentFeatureChange)
	LED_ManualPowerWindow_1(ParentFeatureChange)
	LED_FingerProtection_1(ParentFeatureChange)
	LED_ExteriorMirrorTop_1(ParentFeatureChange)
	LED_ExteriorMirrorRight_1(ParentFeatureChange)
	LED_ExteriorMirrorLeft_1(ParentFeatureChange)
	LED_ExteriorMirrorHeating_1(ParentFeatureChange)
	LED_ExteriorMirrorBottom_1(ParentFeatureChange)
	LED_CentralLockingSystem_1(ParentFeatureChange)
	LED_AutomaticPowerWindow_1(ParentFeatureChange)
	LED_AlarmSystemInteriorMonit_1(ParentFeatureChange)
	LED_AlarmSystemAlarmDetected_1(ParentFeatureChange)
	LED_AlarmSystemAlarm_1(ParentFeatureChange)
	LED_AlaramSystemActive_1(ParentFeatureChange)
	HumanMachineInterface_1(ParentFeatureChange)
	HumanMachineInterface_1(SoftwarePortsChange)
	FingerProtection_1(ParentFeatureChange)
	ExteriorMirror_1(ParentFeatureChange)
	CentralLockingSystem_1(ParentFeatureChange)
	AlarmSystem_1(ParentFeatureChange)
	AutoPW_1(ParentFeatureChange)
	PW_Remote_Control(ParentFeatureChange)
	Remote_Cotroll_Key(ParentFeatureChange)
	PW_Button_DN(ParentFeatureChange)
	PW_Button_UP(ParentFeatureChange)
	Alarm_System_Control(ParentFeatureChange)
	EM_Button(ParentFeatureChange)
	Alarm_Sensor(ParentFeatureChange)
	Heating_timer(ParentFeatureChange)
	Thermometer(ParentFeatureChange)
	EM_Pos_Sensor(ParentFeatureChange)
	Finger_Sensor_SWA(ParentFeatureChange)
	PW_pos_Sensor(ParentFeatureChange)
	door_sensor(ParentFeatureChange)
	driving_sensor(ParentFeatureChange)
	Key_Pos_Sensor(ParentFeatureChange)
	LED_ASIM(ParentFeatureChange)
	LED_ASAC(ParentFeatureChange)
	LED_ASA(ParentFeatureChange)
	LED_ASAD(ParentFeatureChange)
	LED_PW_CLS_UP(ParentFeatureChange)
	LED_PW_down(ParentFeatureChange)
	LED_PW_UP(ParentFeatureChange)
	LED_Heating(ParentFeatureChange)
	LED_EM_Left(ParentFeatureChange)
	LED_EM_Right(ParentFeatureChange)
	LED_EM_Top(ParentFeatureChange)
	LED_EM_Bottom(ParentFeatureChange)
	EM_Motor(ParentFeatureChange)
	LED_FP(ParentFeatureChange)
	Car_locking_system(ParentFeatureChange)
	CLS_LED(ParentFeatureChange)
	Impl_AlarmSystem(ParentFeatureChange)
	Impl_LED_AlarmSystemInterior(ParentFeatureChange)
	Impl_FingerProtection(ParentFeatureChange)
	Impl_LED_CentralLockingSyste(ParentFeatureChange)
	Impl_LED_ExteriorMirrorBotto(ParentFeatureChange)
	Impl_LED_ExteriorMirrorRight(ParentFeatureChange)
	Impl_LED_AutomaticPowerWindo(ParentFeatureChange)
	Impl_CentralLockingSystem(ParentFeatureChange)
	Impl_HumanMachineInterface(ParentFeatureChange)
	Impl_LED_AlarmSystemAlarmDet(ParentFeatureChange)
	Impl_LED_FingerProtection(ParentFeatureChange)
	Impl_LED_ExteriorMirrorLeft(ParentFeatureChange)
	Impl_LED_AlarmSystemAlarm(ParentFeatureChange)
	Impl_LED_ExteriorMirrorHeati(ParentFeatureChange)
	Impl_LED_ManualPowerWindow(ParentFeatureChange)
	Impl_AutoPW(ParentFeatureChange)
	Impl_LED_ExteriorMirrorTop(ParentFeatureChange)
	Impl_LED_AlaramSystemActive(ParentFeatureChange)
	Impl_ExteriorMirror(ParentFeatureChange)
	Impl_RemoteControlKeyControl(ParentFeatureChange)
}

addSWPort{
	wip_func_auto_but
	wip_func_clean_but
	wip_func_disable_but
	wip_func_perm_but
	wip_func_enable_but
	wip_speed_3_but
	wip_speed_l2_but
	wip_speed_l1_but
	ledWiper_on
	ledWiper_off
	ledFrostProtecction_off
	ledFrostPRotection_on
	ledClean_off
	ledClean_on
	wip_auto_but
	wip_l1_but
	wip_l2_but
	wip_l3_but
	wip_enable_but
	wip_disable_but
	wip_perm_but
	wip_clean_but
	wip_func_auto_but
	Sender_Portprototyp146
	wip_func_clean_but
	wip_speed_l1_but
	wip_speed_l2_but
	wip_speed_l3_but
	wip_func_enable_but
	wip_func_perm_but
	wip_func_disable_but
	wip_func_clean_but
	Receiver_Portprototyp216
	Receiver_Portprototyp215
	sense_screenWashFill
	useScreenWash
	screenWashRefilled
	screenWashLow
	sense_windShieldTemperature
	no_frost_detected
	frost_detected
	sense_heavyRainDetected
	sense_littleRainDetected
	sense_rainDetected
	sense_noRain
	rainSensor_WiperOff
	rainSensor_WipeFast
	rainSensor_WipeSlow
	screenWashRefilled
	screenWashLow
	rainSensor_WipeFast
	rainSensor_WipeSlow
	rainSensor_WiperOff
	useScreenWash_1
	wip_func_auto_but
	wip_func_perm_but
	wip_func_disable_but
	wip_func_enable_but
	wip_speed_l3_but
	wip_speed_l2_but
	wip_speed_l1_but
	no_frost_detected
	frost_detected
	useScreenWash
	ledClean_off
	ledClean_on
	autoWiping_off
	autoWiping_on
	ledFrostProtection_off
	ledFrostProtection_on
	wipe_clean
	wipe_fast_speed
	wipe_medium_speed
	wipe_slow_speed
	Receiver_Portprototyp203
	useScreenWash
	wipe_fast
	wipe_medium
	wipe_slow
	wipe_clean
	Receiver_Portprototyp193
	wipe_slow
	wipe_clean
	sense_heavyRainDetected
	sense_littleRainDetected
	sense_noRain
	sense_rainDetected
	sense_noRain
	sense_screenWashFill
	sense_windShieldTemperature
	ledFrostProtection_off
	ledFrostProtection_on
	ledClean_off
	ledClean_on
	ledWiper_off
	ledWiper_on
	wip_l3_but
	wip_l2_but
	wip_l1_but
	wip_auto_but
	wip_clean_but
	wip_perm_but
	wip_disable_but
	wip_enable_but
}

removeSWPort{
}

updateSWPort{
}

addHardwareBlock{
	ECU5_Wiper
	ScreenWashNozzle
	LowQualityWiper
	LED_Wiper
	LED_Clean
	Wiper_Speed_But
	Wiper_Function_But
	WindShieldTemperatureSensor
	ScreenWashSensor
	LowQualityRainSensor
	HighQualityRainSensor
	LED_Frost
	HighQualityWiper
}

removeHardwareBlock{
}

updateHardwareBlock{
	ECU2_HMI(ParentFeatureChange)
	ECU1_Doorsystem(ParentFeatureChange)
	ECU1_Doorsystem(ConnectionsChange)
	CLS_ECU4(ParentFeatureChange)
	Alarm_System_ECU3(ParentFeatureChange)
	LED_PW_Up(ParentFeatureChange)
	LED_PW_DN(ParentFeatureChange)
	LED_PW_CLS(ParentFeatureChange)
	LED_FP(ParentFeatureChange)
	LED_EMT(ParentFeatureChange)
	LED_EMR(ParentFeatureChange)
	LED_EML(ParentFeatureChange)
	LED_EMB(ParentFeatureChange)
	LED_EM_Heating(ParentFeatureChange)
	LED_CLS(ParentFeatureChange)
	LED_ASIM(ParentFeatureChange)
	LED_ASAL(ParentFeatureChange)
	LED_ASAD(ParentFeatureChange)
	LED_ASAC(ParentFeatureChange)
	EM_Motor(ParentFeatureChange)
	Car_Locking_System(ParentFeatureChange)
	Thermoeter(ParentFeatureChange)
	Remote_Control_Key(ParentFeatureChange)
	RCK_PW_Buttons(ParentFeatureChange)
	PW_Position_Sensor(ParentFeatureChange)
	PW_But_UP(ParentFeatureChange)
	PW_But_DN(ParentFeatureChange)
	Key_Pos_Sensor(ParentFeatureChange)
	Heating_Timer(ParentFeatureChange)
	Finger_Sensor_HW(ParentFeatureChange)
	EM_Pos_Sensor(ParentFeatureChange)
	EM_Button(ParentFeatureChange)
	Driving_Snesor(ParentFeatureChange)
	Door_Sensor(ParentFeatureChange)
	Alarm_System_Control(ParentFeatureChange)
	Alarm_Sensor(ParentFeatureChange)
}

addHardwarePort{
}

removeHardwarePort{
}

updateHardwarePort{
}

addOther{
	wipe_clean(InterfaceImpl)
	wipe_fast_speed(InterfaceImpl)
	wipe_medium_speed(InterfaceImpl)
	wipe_slow_speed(InterfaceImpl)
	ledWiper_off(InterfaceImpl)
	ledWiper_on(InterfaceImpl)
	ledFrostProtection_off(InterfaceImpl)
	ledFrostProtection_on(InterfaceImpl)
	ledClean_off(InterfaceImpl)
	ledClean_on(InterfaceImpl)
	useScreenWash(InterfaceImpl)
	screenWashRefilled(InterfaceImpl)
	screenWashLow(InterfaceImpl)
	rainSensor_WipeFast(InterfaceImpl)
	rainSensor_WipeSlow(InterfaceImpl)
	rainSensor_WiperOff(InterfaceImpl)
	clean_screen(InterfaceImpl)
	noFrost(InterfaceImpl)
	wip_func_auto_but(InterfaceImpl)
	wip_func_perm_but(InterfaceImpl)
	wip_func_disable_but(InterfaceImpl)
	wip_func_enable_but(InterfaceImpl)
	wip_func_clean_but(InterfaceImpl)
	wip_speed_l3_but(InterfaceImpl)
	wip_speed_l2_but(InterfaceImpl)
	wip_speed_l1_but(InterfaceImpl)
	windShieldTemperature(InterfaceImpl)
	heavyRain_detected(InterfaceImpl)
	littleRain_detected(InterfaceImpl)
	rainDetected(InterfaceImpl)
	noRain_detected(InterfaceImpl)
	screenWashFill(InterfaceImpl)
	wip_auto_but(InterfaceImpl)
	wip_clean_but(InterfaceImpl)
	wip_perm_but(InterfaceImpl)
	wip_disable_but(InterfaceImpl)
	wip_enable_but(InterfaceImpl)
	wip_l3_but(InterfaceImpl)
	wip_l2_but(InterfaceImpl)
	wip_l1_but(InterfaceImpl)
	frost(InterfaceImpl)
}

removeOther{
}

updateOther{
}
