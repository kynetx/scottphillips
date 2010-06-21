set x=kynetx-APPID
xcopy src build /i /e
if %ERRORLEVEL% NEQ 0 goto end

xcopy build\content build\chrome\content /i /e
if %ERRORLEVEL% NEQ 0 goto end

xcopy build\locale build\chrome\locale /i /e
if %ERRORLEVEL% NEQ 0 goto end

xcopy build\skin build\chrome\skin /i /e
if %ERRORLEVEL% NEQ 0 goto end

rmdir /s /q build\content
if %ERRORLEVEL% NEQ 0 goto end

rmdir /s /q build\locale
if %ERRORLEVEL% NEQ 0 goto end

rmdir /s /q build\skin
if %ERRORLEVEL% NEQ 0 goto end

cd build\chrome
"C:\Program Files\7-Zip\7z.exe" a -tzip "%x%.jar" * -r -mx=0
if %ERRORLEVEL% NEQ 0 goto end
cd ..\..

rmdir /s /q build\chrome\content
if %ERRORLEVEL% NEQ 0 goto end

rmdir /s /q build\chrome\locale
if %ERRORLEVEL% NEQ 0 goto end

rmdir /s /q build\chrome\skin
if %ERRORLEVEL% NEQ 0 goto end


replace chrome.manifest build
if %ERRORLEVEL% NEQ 0 goto end

cd build
"C:\Program Files\7-Zip\7z.exe" a -tzip "%x%.xpi" * -r -mx=9
if %ERRORLEVEL% NEQ 0 goto end
cd ..

goto done

:end
exit(0)

:done


