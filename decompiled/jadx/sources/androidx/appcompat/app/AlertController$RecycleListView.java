package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import f.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f421b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3568t);
        this.f421b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f420a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
