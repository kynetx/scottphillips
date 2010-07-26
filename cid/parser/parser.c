#include <stdio.h>
#include <jni.h>
#include <time.h>

JNIEnv* create_vm() {
	JavaVM* jvm;
	JNIEnv* env;
	JavaVMInitArgs args;
	JavaVMOption options[1];

	/* There is a new JNI_VERSION_1_4, but it doesn't add anything for the purposes of our example. */
	args.version = JNI_VERSION_1_6;
	args.nOptions = 1;
	options[0].optionString = "-Djava.class.path=/Applications/ANTLRWorks.app/Contents/Resources/Java/antlrworks.jar:/Users/ciddennis/Development/sandboxes/cid/parser/output/classes:.";
	args.options = options;
	args.ignoreUnrecognized = JNI_FALSE;

	JNI_CreateJavaVM(&jvm, (void **)&env, &args);
	return env;
}

void invoke_class(JNIEnv* env, char *file) {
	jclass helloWorldClass;
	jmethodID mainMethod;
	jobjectArray applicationArgs;
	jstring applicationArg0;

	helloWorldClass = (*env)->FindClass(env, "com/kynetx/ParseRuleset");

	mainMethod = (*env)->GetStaticMethodID(env, helloWorldClass, "main", "([Ljava/lang/String;)V");

	applicationArgs = (*env)->NewObjectArray(env, 1, (*env)->FindClass(env, "java/lang/String"), NULL);
	applicationArg0 = (*env)->NewStringUTF(env, file);
	(*env)->SetObjectArrayElement(env, applicationArgs, 0, applicationArg0);

	(*env)->CallStaticVoidMethod(env, helloWorldClass, mainMethod, applicationArgs);
}


int main(int argc, char **argv) {
	time_t seconds;
	time_t seconds_end;
	seconds = time (NULL);
	JNIEnv* env = create_vm();
	invoke_class( env, argv[1] );
	seconds_end = time (NULL);
	printf ("Total Time : %ld %s\n", (seconds_end - seconds),argv[1] );
return 0;
}
