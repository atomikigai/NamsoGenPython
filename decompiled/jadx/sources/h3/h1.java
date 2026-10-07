package h3;

import android.view.View;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends x1.w0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f4716u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f4717v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f4718w;

    public h1(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.textFrom);
        jc.i.d(viewFindViewById, "findViewById(...)");
        this.f4716u = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.textSubject);
        jc.i.d(viewFindViewById2, "findViewById(...)");
        this.f4717v = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.textDate);
        jc.i.d(viewFindViewById3, "findViewById(...)");
        this.f4718w = (TextView) viewFindViewById3;
    }
}
