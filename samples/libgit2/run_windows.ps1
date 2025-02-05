param(
  [Parameter(Mandatory=$true, HelpMessage="The path to the libgit2 installation")]
  [string]$libgit2path,
  [Parameter(Mandatory=$true, HelpMessage="URL to clone from")]
  [string]$url,
  [Parameter(Mandatory=$true, HelpMessage="Path to clone into")]
  [string]$path
)

java `
  --enable-native-access=ALL-UNNAMED `
  --enable-preview --source=21 `
  -D"java.library.path=$libgit2path\bin" `
  GitClone.java `
  $url $path
