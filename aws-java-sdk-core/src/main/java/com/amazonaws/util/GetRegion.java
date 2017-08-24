package com.amazonaws.util;


public class GetRegion {
  public static void main(String[] args) {
    System.out.println(EC2MetadataUtils.getEC2InstanceRegion());
  }
}
