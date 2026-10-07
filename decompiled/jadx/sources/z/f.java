package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10772d;
    public final int e;

    public f(Context context, XmlResourceParser xmlResourceParser) {
        this.f10769a = Float.NaN;
        this.f10770b = Float.NaN;
        this.f10771c = Float.NaN;
        this.f10772d = Float.NaN;
        this.e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f10859j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                this.e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new m().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f10772d = typedArrayObtainStyledAttributes.getDimension(index, this.f10772d);
            } else if (index == 2) {
                this.f10770b = typedArrayObtainStyledAttributes.getDimension(index, this.f10770b);
            } else if (index == 3) {
                this.f10771c = typedArrayObtainStyledAttributes.getDimension(index, this.f10771c);
            } else if (index == 4) {
                this.f10769a = typedArrayObtainStyledAttributes.getDimension(index, this.f10769a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
