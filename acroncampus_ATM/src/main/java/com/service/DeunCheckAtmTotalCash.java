package com.service;

import com.service.interfacePackage.AdminService;

import java.util.List;

public class DeunCheckAtmTotalCash implements AdminService {


    @Override
    public boolean adminLogin(String adminPassword) {   // 관리자 로그인
        return false;
    }

    @Override
    public long checkAtmTotalCash() {   // 기계 안의 총 돈
        return 0;
    }

    @Override
    public void addAtmCash(long amount) {   // 기계의 돈 채우기

    }

    @Override
    public void withdrawAtmCash(long amount) {  // 기계의 돈 빼기

    }

    @Override
    public void recordAdminLog(String type, long amount) {   //영석 같이

    }

    @Override
    public List<String> viewAllTransactionLogs() {  //영석 같이
        return List.of();
    }
}
