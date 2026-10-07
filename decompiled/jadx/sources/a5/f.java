package a5;

import android.content.pm.ApkChecksum;
import android.graphics.ImageDecoder;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import da.v;
import fa.c0;
import fa.z;
import g9.b0;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Continuation, OnFailureListener, b0, ga.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198a;

    public /* synthetic */ f(int i) {
        this.f198a = i;
    }

    public static /* bridge */ /* synthetic */ ApkChecksum c(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ ImageDecoder.Source e(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher g(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    @Override // ga.b
    public Object b(JsonReader jsonReader) throws IOException {
        String strH;
        String strNextString = null;
        switch (this.f198a) {
            case 28:
                jsonReader.beginObject();
                String strNextString2 = null;
                String strNextString3 = null;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "libraryName":
                            strNextString2 = jsonReader.nextString();
                            if (strNextString2 == null) {
                                throw new NullPointerException("Null libraryName");
                            }
                            break;
                            break;
                        case "arch":
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                throw new NullPointerException("Null arch");
                            }
                            break;
                            break;
                        case "buildId":
                            strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                throw new NullPointerException("Null buildId");
                            }
                            break;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                strH = strNextString == null ? " arch" : "";
                if (strNextString2 == null) {
                    strH = strH.concat(" libraryName");
                }
                if (strNextString3 == null) {
                    strH = v.h(strH, " buildId");
                }
                if (strH.isEmpty()) {
                    return new z(strNextString, strNextString2, strNextString3);
                }
                throw new IllegalStateException("Missing required properties:".concat(strH));
            default:
                jsonReader.beginObject();
                byte[] bArrDecode = null;
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("filename")) {
                        strNextString = jsonReader.nextString();
                        if (strNextString == null) {
                            throw new NullPointerException("Null filename");
                        }
                    } else if (strNextName2.equals("contents")) {
                        bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                        if (bArrDecode == null) {
                            throw new NullPointerException("Null contents");
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                strH = strNextString == null ? " filename" : "";
                if (bArrDecode == null) {
                    strH = strH.concat(" contents");
                }
                if (strH.isEmpty()) {
                    return new c0(strNextString, bArrDecode);
                }
                throw new IllegalStateException("Missing required properties:".concat(strH));
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z4;
        switch (this.f198a) {
            case 0:
                if (!task.isSuccessful()) {
                    return Tasks.forException(task.getException());
                }
                List list = (List) task.getResult();
                return list.isEmpty() ? Tasks.forResult(null) : Tasks.forResult((String) list.get(0));
            default:
                if (task.isSuccessful()) {
                    da.b bVar = (da.b) task.getResult();
                    String str = "Crashlytics report successfully enqueued to DataTransport: " + bVar.f3091b;
                    aa.d dVar = aa.d.f265a;
                    dVar.b(str);
                    File file = bVar.f3092c;
                    z4 = true;
                    if (file.delete()) {
                        dVar.b("Deleted report file: " + file.getPath());
                    } else {
                        dVar.d("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z4 = false;
                }
                return Boolean.valueOf(z4);
        }
    }

    public /* synthetic */ f(bd.v vVar) {
        this.f198a = 21;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
    }
}
