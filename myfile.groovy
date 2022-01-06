def call(String shellCmd=null){
  if (!shellCmd) {
    shellCmd = “echo hello world”;
}
sh(script: “${shellCmd}”);
}
