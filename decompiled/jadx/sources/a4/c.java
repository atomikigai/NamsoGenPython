package a4;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f118c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f116a = i;
        this.f118c = obj;
        this.f117b = obj2;
    }

    @Override // a4.x
    public final boolean a(Object obj) {
        switch (this.f116a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                ArrayList arrayList = (ArrayList) this.f118c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((x) obj2).a(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.f118c).getPackageName().equals(uri2.getAuthority());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [a4.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [a4.k, java.lang.Object] */
    @Override // a4.x
    public final w b(Object obj, int i, int i10, u3.i iVar) {
        w wVarB;
        Uri uri;
        switch (this.f116a) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new w(new o4.d(uri2), this.f117b.o((AssetManager) this.f118c, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) iVar.c(f4.e.f3594b);
                return new w(new o4.d(num), new j(theme, theme != null ? theme.getResources() : ((Context) this.f118c).getResources(), this.f117b, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f118c;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                u3.f fVar = null;
                for (int i11 = 0; i11 < size; i11++) {
                    x xVar = (x) arrayList.get(i11);
                    if (xVar.a(obj) && (wVarB = xVar.b(obj, i, i10, iVar)) != null) {
                        fVar = wVarB.f180a;
                        arrayList2.add(wVarB.f182c);
                    }
                }
                if (arrayList2.isEmpty() || fVar == null) {
                    return null;
                }
                return new w(fVar, new c0(arrayList2, (p0.d) this.f117b));
            case 3:
                Integer num2 = (Integer) obj;
                Resources resources = (Resources) this.f117b;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
                    break;
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((x) this.f118c).b(uri, i, i10, iVar);
            default:
                Uri uri3 = (Uri) obj;
                x xVar2 = (x) this.f117b;
                List<String> pathSegments = uri3.getPathSegments();
                w wVarB2 = null;
                if (pathSegments.size() == 1) {
                    try {
                        int i12 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i12 != 0) {
                            wVarB2 = xVar2.b(Integer.valueOf(i12), i, i10, iVar);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return wVarB2;
                    } catch (NumberFormatException e4) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return wVarB2;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e4);
                        return wVarB2;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                Context context = (Context) this.f118c;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return xVar2.b(Integer.valueOf(identifier), i, i10, iVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public String toString() {
        switch (this.f116a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f118c).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public c(Resources resources, x xVar) {
        this.f116a = 3;
        this.f117b = resources;
        this.f118c = xVar;
    }

    public c(Context context, k kVar) {
        this.f116a = 1;
        this.f118c = context.getApplicationContext();
        this.f117b = kVar;
    }

    public c(Context context, x xVar) {
        this.f116a = 4;
        this.f118c = context.getApplicationContext();
        this.f117b = xVar;
    }
}
